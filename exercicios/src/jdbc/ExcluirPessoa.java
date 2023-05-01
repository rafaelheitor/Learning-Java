package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {

	public static void main(String[] args) throws SQLException {
		Scanner scanner = new Scanner(System.in);
		Connection conexao = FabricaConexao.getConexao();
		String sql = "DELETE FROM pessoas WHERE codigo = ?";
		System.out.println("Digite o id que deseja excluir: ");
		int id = scanner.nextInt();

		PreparedStatement statement = conexao.prepareStatement(sql);
		statement.setInt(1, id);

		if (statement.executeUpdate() > 0) {

			System.out.println("Pessoa deletada com sucesso");
		} else {
			System.out.println("Não deletado");			
		}

		scanner.close();
		conexao.close();
	}
}
