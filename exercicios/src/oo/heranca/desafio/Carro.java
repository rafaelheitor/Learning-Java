package oo.heranca.desafio;

public class Carro {

	public final int VELOCIDADE_MAXIMA;
	protected int velocidadeAtual;
	private int delta = 5;

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}

	Carro(int velocidadeMaxima) {
		this.VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	public void acelerar() {
		if (this.velocidadeAtual + this.getDelta() > this.VELOCIDADE_MAXIMA) {
			this.velocidadeAtual = this.VELOCIDADE_MAXIMA;
		} else {
			this.velocidadeAtual += getDelta();
		}
	}

	public void frear() {
		if (this.velocidadeAtual >= 5) {
			this.velocidadeAtual -= 5;
		} else {
			this.velocidadeAtual = 0;
		}
	}
}
