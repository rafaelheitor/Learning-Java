package oo.heranca.desafio;

public class Uno extends Carro {

	public Uno(int velocidadeMaxima){
		super(velocidadeMaxima);
	}
	
	@Override
	public String toString() {
		return String.format("Velocidade Atual do veículo %d", this.velocidadeAtual);
	}
}
