package oo.abstracao;

public class AbstratoTeste {

	public static void main(String[] args) {
		Mamifero cachorro1 = new Cachorro();
		
		System.out.println(cachorro1.respirar());
		System.out.println(cachorro1.mover());
		System.out.println(cachorro1.mamar());
	}
}
