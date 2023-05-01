package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AtualizarPessoa {

	public static void main(String[] args) throws SQLException {
		Scanner scanner = new Scanner(System.in);
		Connection conexao = FabricaConexao.getConexao();

		System.out.println("Informe o código da pessoa");
		int codigoPessoa = scanner.nextInt();
		
		String sqlSelect = "SELECT * FROM pessoas WHERE codigo = ?";
		PreparedStatement selectStatement = conexao.prepareStatement(sqlSelect);
		selectStatement.setInt(1, codigoPessoa);
		ResultSet resultado = selectStatement.executeQuery();
		
		if(resultado.next()) {
			Pessoa pessoa = new Pessoa(resultado.getInt(1), resultado.getString(2));
			System.out.println("O nome atual é: " + pessoa.getNome());

			System.out.println("Informe o novo nome da pessoa");
			
			scanner.nextLine();
			String novoNomePessoa = scanner.nextLine();
			String sqlUpdate = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
			
			PreparedStatement statement = conexao.prepareStatement(sqlUpdate);
			statement.setString(1, novoNomePessoa);
			statement.setInt(2, codigoPessoa);
			
			statement.execute();
			System.out.println("Pessoa alterada com sucesso");
		}
		
		conexao.close();
		scanner.close();
	}
}
