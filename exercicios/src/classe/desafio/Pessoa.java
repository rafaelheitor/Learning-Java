package classe.desafio;

public class Pessoa {

	String nome;
	double peso;
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	void comer(Comida prato){
		this.peso += prato.peso;
		prato.peso = 0;
	}
	
	String apresentar() {
		return String.format("Olá eu sou o %s tenho %.2fKgs.", this.nome, this.peso);
	}
}
