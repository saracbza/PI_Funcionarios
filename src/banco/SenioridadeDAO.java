package banco;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entidades.Senioridade;

public class SenioridadeDAO {

	private BD bd;
	private String men, sql;

	public SenioridadeDAO() {
		bd = new BD();
	}
	
	/**
	 * Busca todas as senioridades cadastradas no banco
	 * @param sql - comando para banco
	 * @return - lista com todas as senioridades cadastradas
	 */
	public List<Senioridade> listar(String sql) {
		List<Senioridade> lista = new ArrayList<Senioridade>();
		bd.getConnection();
			try {
				bd.st = bd.con.prepareStatement(sql);
				bd.rs = bd.st.executeQuery();

				while(bd.rs.next()) { 
					Senioridade s = new Senioridade(bd.rs.getInt(1),bd.rs.getString(2),
                                                                bd.rs.getFloat(3));
					lista.add(s);
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
	 * Editar a porcentagem de reconhecimento de uma senioridade a partir do seu codigo
	 * @param s - informacoes novas para atualizacao
	 * @param cod - codigo da senioridade a ser alterado
	 * @return - mensagem de confirmacao da alteracao
	 */
	public String editar(Senioridade s, int cod) {
		sql = "UPDATE senioridade set porc_rec=?\r\n"
			+ "WHERE cod_sen = ?";
			
			try {
			bd.getConnection();
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setFloat(1, s.getPorcentagem_rec());
			bd.st.setInt(2, cod);
			bd.st.executeUpdate();
			
			men = "Porcentagem de reconhecimento da senioridade "+s.getNivel()+" alterado com sucesso!";
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
