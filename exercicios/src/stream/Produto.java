package stream;

public class Produto {

	String nome;
	double preco;
	String categoria;
	String fabricante;
	
	Produto(String nome, double preco, String categoria, String fabricante){
		this.nome = nome;
		this.preco = preco;
		this.categoria = categoria;
		this.fabricante = fabricante;
	}
	
	@Override
	public String toString() {
		return String.format("%s %.2f %s %s ", this.nome, this.preco, this.fabricante, this.categoria);
	}
}
