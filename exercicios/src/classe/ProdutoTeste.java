package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		Produto produto1 = new Produto("Celular", 2000.99);
		Produto produto2 = new Produto();

		produto2.nome = "Tablet";
		produto2.preco = 1500.99;
		
		Produto.desconto = 0.50;

		double precoProduto1 = produto1.precoComDesconto();
		double precoProduto2 = produto2.precoComDesconto();

		System.out.println(produto1.nome);
		System.out.println(produto2.nome);

		System.out.printf("O preco final do celular é: R$%.2f\n", precoProduto1);
		System.out.printf("O preco final do tablet é: R$%.2f", precoProduto2);

	}
}
