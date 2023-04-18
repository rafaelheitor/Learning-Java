package classe.desafio;

public class Jantar {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("João", 65.7);
		Comida comida1 = new Comida("Cuscuz", 0.8);
		Comida comida2 = new Comida("salada", 0.3);
		System.out.println(pessoa1.apresentar());
				
		pessoa1.comer(comida1);
		System.out.println(pessoa1.apresentar());
		
		pessoa1.comer(comida2);
		System.out.println(pessoa1.apresentar());
		
	}
}
