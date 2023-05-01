package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {

	public static void main(String[] args) throws SQLException {
		Connection conexao = FabricaConexao.getConexao();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o nome: ");
		
		String nome = scanner.nextLine();
		
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		
		PreparedStatement statement = conexao.prepareStatement(sql);
		statement.setString(1, nome);
		
		statement.execute();
		
		System.out.println("Pessoa Incluída com sucesso");
		scanner.close();
	}
}
