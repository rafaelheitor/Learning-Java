package oo.heranca.teste;

import oo.heranca.desafio.Ferrari;
import oo.heranca.desafio.Uno;

public class DesafioTeste {

	public static void main(String[] args) {
		Uno unoMille = new Uno(200);
		Ferrari ferrari1 = new Ferrari(320);
		
		unoMille.acelerar();
		unoMille.acelerar();
		unoMille.acelerar();
//		ferrari1.acelerar();
//		ferrari1.acelerar();
//		ferrari1.acelerar();
//		ferrari1.ligarTurbo();
		ferrari1.ligarAr();
//		ferrari1.desligarAr();
		ferrari1.acelerar();
		ferrari1.acelerar();

		unoMille.frear();
		unoMille.frear();
		ferrari1.frear();
		System.out.println(ferrari1.velocidadeDoAr());
		
		System.out.println(unoMille);
		System.out.println(ferrari1);
	}
}
