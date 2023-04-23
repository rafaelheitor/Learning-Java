package oo.heranca;

public class Heroi extends Jogador {

	public Heroi(int posicaoX, int posicaoY){
		super(posicaoX, posicaoY);
	}
	
	public boolean atacar(Jogador oponente) {
//		 int deltaX = Math.abs(this.posicaoX - oponente.posicaoX);
//		 int deltaY = Math.abs(this.posicaoY - oponente.posicaoY);
//		 
//		 if(deltaX == 0 && deltaY == 1) {
//			 oponente.vida -= 20;
//			 return true;
//		 } else if(deltaX == 1 && deltaY == 0) {
//			 oponente.vida -= 20;
//			 return true;
//		 } else {
//			 return false;
//		 }
		
		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);
		
		return ataque1 || ataque2;
	}
}
