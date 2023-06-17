package teste.basico;

import java.util.List;

import infrastructure.DAO;
import modelo.basico.Produto;

public class ObterProdutos {

	public static void main(String[] args) {
		DAO<Produto> dao = new DAO<>(Produto.class);
		
		List<Produto> produtos = dao.obterTodos();
		
		for(Produto produto: produtos) {
			System.out.println("ID: " + produto.getId() + " nome produto " + produto.getNome());
		}
		
		double precoTotal = produtos.stream().map(p -> p.getPreco()).reduce(0.0, (total, atual) -> total + atual);
		System.out.println("O preco total dos produtos é: " + precoTotal);
	}
	
}
