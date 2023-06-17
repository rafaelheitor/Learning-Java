package teste.basico;

import infrastructure.DAO;
import modelo.basico.Produto;

public class NovoProduto {
	public static void main(String[] args) {
		DAO<Produto> dao = new DAO<>(Produto.class);
		
		Produto produto1 = new Produto("Monitor 28\"", 1_000.00);
		
		dao.incluirAtomico(produto1);
		System.out.println("O ID do produto é: " + produto1.getId());
	}
}
