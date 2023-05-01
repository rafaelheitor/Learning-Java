package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas2 {

	public static void main(String[] args) throws SQLException {
		Connection conexao = FabricaConexao.getConexao();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe o valor que deseja pesquisar");
		String pesquisaNome = scanner.next();
		
		String sql = "SELECT * FROM pessoas WHERE nome like ?";
		
		PreparedStatement statement = conexao.prepareStatement(sql);
		statement.setString(1, "%" + pesquisaNome + "%");
		ResultSet resultado = statement.executeQuery();
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		while(resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			
			pessoas.add(new Pessoa(codigo, nome));
		}
		
		for(Pessoa p: pessoas) {
			System.out.println(p.getCodigo() + " " + p.getNome());
		}
		
		conexao.close();
		scanner.close();
	}
}
