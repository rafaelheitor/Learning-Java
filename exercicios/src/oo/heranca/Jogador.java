package oo.heranca;

public class Jogador {

	public int vida = 100;
	public int posicaoX;
	public int posicaoY;
	
	protected Jogador(int posicaoX, int posicaoY){
		this.posicaoX = posicaoX;
		this.posicaoY = posicaoY;
	}
	
	public boolean andar(Direcao direcao) {
		switch(direcao) {
		case NORTE:
			this.posicaoY--;
			break;
		case LESTE:
			this.posicaoX++;
			break;
		case SUL: 
			this.posicaoY++;
			break;
		case OESTE:
			this.posicaoX--;
			break;
		}
		return true;
	}
	
	public boolean atacar(Jogador oponente) {
		 
		 int deltaX = Math.abs(this.posicaoX - oponente.posicaoX);
		 int deltaY = Math.abs(this.posicaoY - oponente.posicaoY);
		 
		 if(deltaX == 0 && deltaY == 1) {
			 oponente.vida -= 10;
			 return true;
		 } else if(deltaX == 1 && deltaY == 0) {
			 oponente.vida -= 10;
			 return true;
		 } else {
			 return false;
		 }
	 }
}
