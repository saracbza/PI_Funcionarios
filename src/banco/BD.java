package banco;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

	/**
	 * Classe responsavel por realizar a conexao ao banco de dados
	 *
	 */
	public class BD {
		
		public Connection con = null;
		public PreparedStatement st = null;
		public ResultSet rs = null; 
		
		private final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		private final String DATABASE_NAME = "funcionarios";
		
		private final String URL = 
				"jdbc:sqlserver://localhost:1433;databasename="+DATABASE_NAME; 
		private final String LOGIN = "sa";
		private final String PASSWORD = "fatec";
		
		public boolean getConnection() {
			try {
				Class.forName(DRIVER);
				con = DriverManager.getConnection(URL, LOGIN, PASSWORD);
				System.out.println("Conectado!");
				return true;
			}
			catch (SQLException e) {
				System.out.println("Falha na conexão: " + e);
			}
			catch(ClassNotFoundException e) {
				System.out.println("Driver não encontrado!");
			}
			return false;
		}
		
		public void close() {
			try {
				if (rs != null) rs.close();
			} catch (SQLException e) {}
			try {
				if (st != null) st.close();
			} catch (SQLException e) {}
			try {
				if (con != null)  con.close();
				System.out.println("Desconectado!");
			}
			catch (SQLException e) {}
		}

	}

