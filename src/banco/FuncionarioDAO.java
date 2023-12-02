package banco;

//import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import entidades.Funcionario;
import java.util.Vector;


public class FuncionarioDAO {
	private BD bd;
	private String men, sql;
	
	public float valor_hr, porcentagem_rec;
	public int dependentes;
	public String sen, cargo, nome;
	
	public FuncionarioDAO() {
		bd = new BD();
	}
	
	/**
	 * Retorna todos os funcionarios cadastrados no banco
	 * @param sql - comando para o banco
	 * @return - lista com todos os funcionarios
	 */
	public List<Funcionario> listarTudo(String sql) {
		List<Funcionario> lista = new ArrayList<Funcionario>();
		bd.getConnection();
			try {
				bd.st = bd.con.prepareStatement(sql);
				bd.rs = bd.st.executeQuery();
				
				while(bd.rs.next()) { 
					Funcionario f = new Funcionario(bd.rs.getString(2), bd.rs.getString(3),
							bd.rs.getDate(4), bd.rs.getDate(5), bd.rs.getInt(6));
					lista.add(f);
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
	* Busca todos os nomes de funcionarios cadastrados no banco
	* @param sql - comando de solicitacao de informacoes para o banco
	* @return - lista com todos os funcionarios
	*/
        public List<Funcionario> listarNome(String sql) {
			List<Funcionario> lista = new ArrayList<Funcionario>();
			bd.getConnection();
				try {
					bd.st = bd.con.prepareStatement(sql);
					bd.rs = bd.st.executeQuery();
					
					while(bd.rs.next()) { 
						Funcionario f = new Funcionario(bd.rs.getString(1));
                                               	lista.add(f);
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
		 * Busca todos os codigos dos funcionarios cadastrados no banco
		 * @param sql - comando de solicitacao de informacoes para o banco
		 * @return - lista com todos os cargos
		 */
		public Vector<Integer> listarCod(String sql) {
                    Vector<Integer> cod_Func = new Vector<Integer>();     
			bd.getConnection();
				try {
					bd.st = bd.con.prepareStatement(sql);
					bd.rs = bd.st.executeQuery();
					
					while(bd.rs.next()) { 
                                                cod_Func.addElement(bd.rs.getInt(1));
					}
				}
				catch(SQLException e) {
					System.out.println("Erro: " + e);
				}
				finally {
					bd.close();
				}
				return cod_Func;
			}
                
        
        /**
        * Busca nome, cargo e senioridade mais atuais de um funcionario apartir de seu codigo.
        * @param cod - codigo do funcionario a ser listado nome, cargo e senioridade
        */
	public void listarFuncionario(int cod) {
		if(bd.getConnection()) {
			String sql = "SELECT f.nome, c.nome_cargo, s.nivel\r\n"
					+ "FROM cargo c, cargo_funcionario cf, funcionario f, \r\n"
					+ "sen_funcionario sf, senioridade s\r\n"
					+ "WHERE c.cod_cargo = cf.cod_cargo \r\n"
					+ "AND f.cod_func = cf.cod_func \r\n"
					+ "AND sf.cod_func = f.cod_func \r\n"
					+ "AND sf.cod_sen = s.cod_sen\r\n"
					+ "AND c.cod_cargo = (SELECT cod_cargo\r\n"
					+ "FROM cargo_funcionario \r\n"
					+ "WHERE data_alt IN \r\n"
					+ "(SELECT MAX(data_alt) FROM cargo_funcionario WHERE cod_func = ?))\r\n"
					+ "AND s.cod_sen = (SELECT cod_sen\r\n"
					+ "FROM sen_funcionario \r\n"
					+ "WHERE data_alt IN \r\n"
					+ "(SELECT MAX(data_alt) FROM sen_funcionario WHERE cod_func = ?))"
					+ "AND f.cod_func = ?";
			try {
				bd.st = bd.con.prepareStatement(sql);
				bd.st.setInt(1, cod);
				bd.st.setInt(2, cod);
				bd.st.setInt(3, cod);
				bd.rs = bd.st.executeQuery();
				
				while(bd.rs.next()) { 
					nome = bd.rs.getString(1);
					cargo = bd.rs.getString(2);
					sen = bd.rs.getString(3);
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
	 * Busca as principais informacoes necessarias do funcionario para o calculo do seu pagamento
         * considerando apenas a alteracao mais recente de cargo e senioridade (conforme data de alteracao)
	 * @param cod - parametro considerado para encontrar dados de funcionario especifico
	 */
	public void listarDados(int cod) {
		if(bd.getConnection()) {
			String sql = "SELECT f.dependentes, c.valor_por_hr, s.porc_rec\n" +
                            "FROM cargo c, cargo_funcionario cf, funcionario f, \n" +
                            "sen_funcionario sf, senioridade s\n" +
                            "WHERE c.cod_cargo = cf.cod_cargo \n" +
                            "AND f.cod_func = cf.cod_func \n" +
                            "AND sf.cod_func = f.cod_func \n" +
                            "AND sf.cod_sen = s.cod_sen\n" +
                            "AND c.cod_cargo = (SELECT cod_cargo\n" +
                            "FROM cargo_funcionario \n" +
                            "WHERE data_alt IN \n" +
                            "(SELECT MAX(data_alt) FROM cargo_funcionario WHERE cod_func = ?))\n" +
                            "AND s.cod_sen = (SELECT cod_sen\n" +
                            "FROM sen_funcionario \n" +
                            "WHERE data_alt IN \n" +
                            "(SELECT MAX(data_alt) FROM sen_funcionario WHERE cod_func = ?))\n" +
                            "AND f.cod_func = ?";
			try {
				bd.st = bd.con.prepareStatement(sql);
				bd.st.setInt(1, cod);
                                bd.st.setInt(2, cod);
                                bd.st.setInt(3, cod);
				bd.rs = bd.st.executeQuery();
				
				while(bd.rs.next()) { 
					dependentes = bd.rs.getInt(1);
					valor_hr = bd.rs.getFloat(2);
					porcentagem_rec = bd.rs.getFloat(3);
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
	 * Realiza a gravacao de um funcionario no banco de dados
	 * @param f - o funcionario a ser gravado
	 * @return - mensagem de aviso do processo
	 */
	public String salvar(Funcionario f) {
		
		sql = "INSERT INTO funcionario VALUES (?, ?, ?, ?, ?)"; //nome, cpf, data nasc, data contrat, dependentes
		try {
			bd.getConnection();
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, f.getNome());
			bd.st.setString(2, f.getCpf());
			bd.st.setInt(5, f.getDependentes());
			
			//converter de java.util.date para java.sql.date
			java.sql.Date data_nasc = new java.sql.Date(f.getData_nasc().getTime());
			java.sql.Date data_contrat = new java.sql.Date(f.getData_contrat().getTime());
			bd.st.setDate(3, data_nasc);
			bd.st.setDate(4, data_contrat);
			
			bd.st.executeUpdate();
			
			men = "Funcionario "+f.getNome()+" inserido com sucesso!";
		}
		catch(SQLException erro) {
			men = "Falha: verifique se o funcionario já existe... " + erro;
		}
		finally {
			bd.close();
		}
		return men;
	}
	
	/**
	 * Exclui um funcionario a partir de seu codigo
	 * @param cod - codigo do funcionario a ser excluido
	 * @return - mensagem de confirmacao da exclusao
	 */
	public String excluir (int cod) {
		sql = "DELETE FROM funcionario WHERE cod_func = ?";
		try {
			bd.getConnection();
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setInt(1, cod);
			if (bd.st.executeUpdate()==1) men = "Excluido com sucesso!";
			else men = "Funcionario não encontrado";
	}
		catch(SQLException erro) {
			men = "Falha: " + erro;
		}
		finally {
			bd.close();
		}
		return men;
	}
	
	/** 
	 * Localiza um funcionario a partir de seu nome
	 * @param nome - nome do funcionario a ser localizado
	 * @return list com dados do funcionario pesquisado
	 */
	public List<Funcionario> pesquisar (String nome) {
		List<Funcionario> lista = new ArrayList<Funcionario>();
		sql = "SELECT * FROM funcionario WHERE nome LIKE ?";
		try {
			bd.getConnection();
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, "%" + nome + "%");
			bd.rs = bd.st.executeQuery();
			while(bd.rs.next()) { 
			Funcionario f = new Funcionario(bd.rs.getInt(1), bd.rs.getString(2), bd.rs.getString(3),
                            bd.rs.getDate(4), bd.rs.getDate(5), bd.rs.getInt(6));
			lista.add(f);
				}
	}
		catch(SQLException erro) {
			
		}
		finally {
			bd.close();
		}
		return lista;
	}
	
	/**
	 * Editar um funcionario a partir do seu codigo
	 * @param f - informacoes novas para atualizacao
	 * @param codFunc - codigo do funcionario a ser alterado
	 * @return - mensagem de confirmacao da alteracao
	 */
	public String editar(Funcionario f, int codFunc) {
		sql = "UPDATE funcionario set nome= ?, cpf=?, data_nasc=?, data_contrat=?, dependentes=? "
                        + "WHERE cod_func = ?";
			try {
			bd.getConnection();
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, f.getNome());
			bd.st.setString(2, f.getCpf());
			bd.st.setInt(5, f.getDependentes());
			bd.st.setInt(6, codFunc);
			
			java.sql.Date data_nasc = new java.sql.Date(f.getData_nasc().getTime());
			java.sql.Date data_contrat = new java.sql.Date(f.getData_contrat().getTime());
			bd.st.setDate(3, data_nasc);
			bd.st.setDate(4, data_contrat);
			
			bd.st.executeUpdate();
			men = "Funcionario "+f.getNome()+" alterado com sucesso!";
		}
		catch(SQLException erro) {
			men = "Falha: " + erro;
		}
		finally {
			bd.close();
		}
		return men;
	}
	
	/**
	 * Atribui um cargo ao funcionario a partir da tabela relacionamento no banco
	 * @param cpf - cpf informado pelo usuario para encontrar funcionario
         * @param codCargo - codigo do cargo a ser atribuido
         * @param data_alt - data da alteracao do cargo
	 * @return - mensagem de confirmacao do processo
	 */
	public String atribuirCargoFuncionario(String cpf, int codCargo, Date data_alt) {
            int codFunc = 0;
            if(bd.getConnection()) {
			String sql = "SELECT cod_func FROM funcionario\n" +
                        "WHERE cpf = ?";
			try {
				bd.st = bd.con.prepareStatement(sql);
				bd.st.setString(1, cpf);
				bd.rs = bd.st.executeQuery();
				
				while(bd.rs.next()) { 
				codFunc = bd.rs.getInt(1);
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
		if (codFunc != 0){
		sql = "INSERT INTO cargo_funcionario VALUES (?, ?, ?)"; //cod cargo, cod func, data
		try {
			bd.getConnection();
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setInt(1, codCargo);
			bd.st.setInt(2, codFunc);
			
			//converter de java.util.date para java.sql.date
			java.sql.Date data_alteracao = new java.sql.Date(data_alt.getTime());
			bd.st.setDate(3, data_alteracao);
			bd.st.executeUpdate();
			
			men = "Cargo atribuido a funcionario com sucesso!";
		}
		catch(SQLException erro) {
			men = "Falha: verifique se o funcionario ou o cargo escolhido existe... " + erro;
		}
		finally {
			bd.close();
		}
                } else men = "Falha: verifique se o funcionario ou o cargo escolhido existe... ";
                
                return men;
	}
	
	/**
	 * Atribui uma senioridade ao funcionario a partir da tabela relacionamento no banco
	 * @param cpf - cpf informado pelo usuario para encontrar funcionario
         * @param codSen - codigo da senioridade a ser atribuida
         * @param data_alt - data da alteracao da senioridade
	 * @return - mensagem de confirmacao do processo
	 */
	public String atribuirSenFuncionario(String cpf, int codSen, Date data_alt) {
		int codFunc = 0;
            if(bd.getConnection()) {
			String sql = "SELECT cod_func FROM funcionario\n" +
                        "WHERE cpf = ?";
			try {
				bd.st = bd.con.prepareStatement(sql);
				bd.st.setString(1, cpf);
				bd.rs = bd.st.executeQuery();
				
				while(bd.rs.next()) { 
				codFunc = bd.rs.getInt(1);
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
		if (codFunc != 0){
		sql = "INSERT INTO sen_funcionario VALUES (?, ?, ?)"; //cod sen, cod func, data
		try {
			bd.getConnection();
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setInt(1, codSen);
			bd.st.setInt(2, codFunc);
			
			//converter de java.util.date para java.sql.date
			java.sql.Date data_alteracao = new java.sql.Date(data_alt.getTime());
			bd.st.setDate(3, data_alteracao);
			bd.st.executeUpdate();
			
			men = "Senioridade atribuida a funcionario com sucesso!";
		}
		catch(SQLException erro) {
			men = "Falha: verifique se o funcionario ou o cargo escolhido existe... " + erro;
		}
		finally {
			bd.close();
		}
                } else men = "Falha: verifique se o funcionario ou o cargo escolhido existe... ";
                
                return men;
	}
        
        /**
         * Busca o codigo da ultima senioridade atribuida a um funcinario especifico
         * @param codFunc - parametro considerado para encontrar dados de funcionario especifico
         * @return codigo da senioridade
         */
        public int consultaSenFuncionario (int codFunc) {
                int sen = 0;
		sql = "SELECT cod_sen FROM sen_funcionario \n" +
                "WHERE cod_func = ?\n" +
                "AND data_alt IN \n" +
                "(SELECT MAX(data_alt) FROM sen_funcionario WHERE cod_func = ?)";
		try {
			bd.getConnection();
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setInt(1, codFunc);
                        bd.st.setInt(2, codFunc);
			bd.rs = bd.st.executeQuery();
			while(bd.rs.next()) { 
			sen = bd.rs.getInt(1);
		}
	}
		catch(SQLException erro) {
			
		}
		finally {
			bd.close();
		}
		return sen;
	}
        
        /**
         * Busca o codigo do ultimo cargo atribuido a um funcinario especifico
         * @param codFunc - parametro considerado para encontrar dados de funcionario especifico
         * @return codigo do cargo
         */        
         public int consultaCargoFuncionarioCod (int codFunc) {
                int cargo = 0;
		sql = "SELECT cod_cargo FROM cargo_funcionario \n" +
                "WHERE cod_func = ?\n" +
                "AND data_alt IN \n" +
                "(SELECT MAX(data_alt) FROM cargo_funcionario WHERE cod_func = ?)";
		try {
			bd.getConnection();
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setInt(1, codFunc);
                        bd.st.setInt(2, codFunc);
			bd.rs = bd.st.executeQuery();
			while(bd.rs.next()) { 
			cargo = bd.rs.getInt(1);
		}
	}
		catch(SQLException erro) {
			
		}
		finally {
			bd.close();
		}
		return cargo;
	}
         
        /**
         * Busca o nomes do ultimo cargo atribuido a um funcinario especifico
         * @param codFunc - parametro considerado para encontrar dados de funcionario especifico
         * @return codigo do cargo
         */ 
          public String consultaCargoFuncionarioNome (int codFunc) {
                String cargo = "teste";
		sql = "SELECT c.nome_cargo FROM cargo c, cargo_funcionario cf, funcionario f\n" +
                "WHERE c.cod_cargo = cf.cod_cargo AND f.cod_func = cf.cod_func\n" +
                "AND data_alt IN \n" +
                "(SELECT MAX(data_alt) FROM cargo_funcionario WHERE cod_func = ?)";
		try {
			bd.getConnection();
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setInt(1, codFunc);
			bd.rs = bd.st.executeQuery();
			while(bd.rs.next()) { 
			cargo = bd.rs.getString(1);     
		}
	}
		catch(SQLException erro) {
			
		}
		finally {
			bd.close();
		}
                System.out.println(cargo);
		return cargo;
	}
}
