package lambdas;

public class Produto {

	final String NOME;
	final double PRECO;
	final double DESCONTO;

	public Produto(String NOME, double PRECO, double DESCONTO) {
		this.NOME = NOME;
		this.PRECO = PRECO;
		this.DESCONTO = DESCONTO;
	}

	public String toString() {
		double precoFinal = this.PRECO * (1 - this.DESCONTO);
		return String.format("Produto %s tem o preco: %.2f", this.NOME, precoFinal);
	}
}
