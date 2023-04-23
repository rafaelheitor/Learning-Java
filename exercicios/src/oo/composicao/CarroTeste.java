package oo.composicao;

public class CarroTeste {

	public static void main(String[] args) {
		Carro carro1 = new Carro();
		
		System.out.println(carro1.estaLigado());
		
		carro1.ligar();
		System.out.println(carro1.estaLigado());
		
		System.out.println(carro1.motor.giros());

		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		
		System.out.println(carro1.motor.giros());
		
		carro1.frear();
		carro1.frear();
		carro1.frear();
		carro1.frear();
	
		System.out.println(carro1.motor.giros());
	}
}
