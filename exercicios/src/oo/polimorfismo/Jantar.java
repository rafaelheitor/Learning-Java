package oo.polimorfismo;

public class Jantar {

	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa(99.60);
		Arroz igrediente1 = new Arroz(0.2);
		Feijao igrediente2 = new Feijao(0.180);
		
		System.out.println(pessoa1.getPeso());
		
		pessoa1.comer(igrediente1);
		pessoa1.comer(igrediente2);
		
		System.out.println(pessoa1.getPeso());
		
		Sorvete sobremesa = new Sorvete(0.4);
		
		pessoa1.comer(sobremesa);
		System.out.println(pessoa1.getPeso());
	}

}
