package banco;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entidades.Pagamento;
import java.util.Date;
import java.util.Vector;

public class PagamentoDAO {
	
	private BD bd;
	private String men, sql;
        
        public String nomeFunc, cargoSen;
        public float inss, irrf, fgts, salario;
        public Date data_pag = new Date();
	
	public PagamentoDAO() {
		bd = new BD();
	}
   
	/**
	 * Busca todos os pagamentos lancados no banco
	 * @param sql - comando para banco
	 * @return - lista com todos os pagamentos lancados
	 */
	public List<Pagamento> pagamentos(String nome) {
		List<Pagamento> lista = new ArrayList<Pagamento>();
		bd.getConnection();
			try {
                            String sql = "SELECT  p.cod_pagamento, f.nome, p.cargo_sen, data_pagamento\n" +
                        "FROM pagamento p \n" +
                        "inner join funcionario f ON f.cod_func = p.cod_func\n" +
                        "WHERE f.nome LIKE ?\n" +
                        "ORDER BY p.cod_pagamento";
				bd.st = bd.con.prepareStatement(sql);
                                bd.st.setString(1, "%" + nome + "%");
				bd.rs = bd.st.executeQuery();
				
				while(bd.rs.next()) { 
					Pagamento p = new Pagamento(bd.rs.getInt(1), bd.rs.getString(2), 
                                                bd.rs.getString(3), bd.rs.getDate(4));
					lista.add(p);
				}
			}
			catch(SQLException e) {
				System.out.println("Erro: " + e);
			}
			finally {
				bd.close();
			}
			return lista;
		}
	
	/**
	 * Gerar holerite do funcionario considerando seu codigo
	 * @param cod - parametro usado para encontrar funcionario especifico
	 */
	public void holerite(int cod) {
		if(bd.getConnection()) {
			String sql = "SELECT f.nome, p.salario,p.inss, p.irrf, p.fgts, p.cargo_sen, data_pagamento\n" +
                        "FROM pagamento p \n" +
                        "inner join funcionario f ON f.cod_func = p.cod_func\n" +
                        "WHERE p.cod_pagamento = ?";
			try {
				bd.st = bd.con.prepareStatement(sql);
				bd.st.setInt(1, cod);
				bd.rs = bd.st.executeQuery();
				
				while(bd.rs.next()) { 
					nomeFunc = bd.rs.getString(1);
					salario = bd.rs.getFloat(2);
					inss = bd.rs.getFloat(3);
					irrf = bd.rs.getFloat(4);
					fgts = bd.rs.getFloat(5);
					cargoSen = bd.rs.getString(6);
					data_pag = bd.rs.getDate(7);
				}
			}
			catch(SQLException e) {
				System.out.println("Erro: " + e);
			}
			finally {
				bd.close();
			}
		}
		
		else {
			System.out.println("Falha na conexão!");
		}
	}

	/**
	 * Realiza a gravacao de um pagamento no banco de dados
	 * @param p - o pagamento a ser gravado
	 * @return - mensagem de aviso do processo
	 */
	public String salvar(Pagamento p) {
		//cod_func, cargo_sen, salario, inss, irrf, fgts, data do pagamento
		sql = "INSERT INTO pagamento VALUES (?, ?, ?, ?, ?, ?, ?)";
		try {
			bd.getConnection();
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setInt(1, p.getCodigo_func());
			bd.st.setString(2, p.getCargo_senioridade());
			bd.st.setFloat(3, p.getSalario());
			bd.st.setFloat(4, p.getInss());
			bd.st.setFloat(5, p.getIrrf());
			bd.st.setFloat(6, p.getFgts());
			
			//converter de java.util.date para java.sql.date
			java.sql.Date data_pagamento= new java.sql.Date(p.getData_pagamento().getTime());
			bd.st.setDate(7, data_pagamento);
			
			bd.st.executeUpdate();
			
			men = "Pagamento inserido com sucesso!";
		}
		catch(SQLException erro) {
			men = "Falha: verifique se o pagamento já foi feito... " + erro;
		}
		finally {
			bd.close();
		}
		return men;
	}
       
	/**
	 * Exclui um pagamento a partir de seu codigo
	 * @param cod - codigo do pagamento a ser excluido
	 * @return - mensagem de confirmacao da exclusao
	 */
	public String excluir (int cod) {
		sql = "DELETE FROM pagamento WHERE cod_pagamento = ?";
		try {
			bd.getConnection();
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setInt(1, cod);
			if (bd.st.executeUpdate()==1) men = "Excluido com sucesso!";
			else men = "Pagamento não encontrado";
	}
		catch(SQLException erro) {
			men = "Falha: " + erro;
		}
		finally {
			bd.close();
		}
		return men;
	}
}
