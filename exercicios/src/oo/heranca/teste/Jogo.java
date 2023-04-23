package oo.heranca.teste;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {

	public static void main(String[] args) {
		Monstro monstro = new Monstro(25, 19);

		Heroi heroi = new Heroi(25, 20);

//		jogador1.andar(Direcao.SUL);
//		jogador1.andar(Direcao.LESTE);
//		jogador1.andar(Direcao.SUL);
//		jogador1.andar(Direcao.LESTE);

		System.out.printf("A posição atual do jogador é: %d %d\n", monstro.posicaoX, monstro.posicaoY);

		System.out.println("Monstro tem =>  " + monstro.vida + " de vida");
		System.out.println("Heroi tem =>  " + heroi.vida + " de vida");

		monstro.atacar(heroi);
		heroi.atacar(monstro);

		monstro.atacar(heroi);
		heroi.atacar(monstro);

		monstro.andar(Direcao.OESTE);

		monstro.atacar(heroi);
		heroi.atacar(monstro);

		System.out.println("Monstro tem =>  " + monstro.vida + " de vida");
		System.out.println("Heroi tem =>  " + heroi.vida + " de vida");

	}
}
