package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {

	public static void main(String[] args) throws SQLException {
		String enderecoConexao = "jdbc:mysql://localhost";
		String usuario = "root";
		String senha = "123456789";
		
		Connection conexao = DriverManager.getConnection(enderecoConexao, usuario, senha);
		
		Statement statement = conexao.createStatement();
		
		statement.execute("CREATE DATABASE IF NOT EXISTS curso_Java");
		
		conexao.close();
	}
}
