package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {

	public static void main(String[] args) throws SQLException {
		
		String enderecoConexao = "jdbc:mysql://localhost";
		String usuario = "root";
		String senha = "123456789";
		
		Connection conexao = DriverManager.getConnection(enderecoConexao, usuario, senha);
		
		System.out.println("Conexão Efetuada com sucesso");
		
		conexao.close();
	}
}
