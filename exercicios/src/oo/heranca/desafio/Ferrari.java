package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {
	private boolean ligarTurbo;
	private boolean ligarAr;

	public Ferrari() {
		this(320);
	}

	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		setDelta(15);
	}

	@Override
	public String toString() {
		return String.format("Velocidade Atual do veículo %d", this.velocidadeAtual);
	}

	@Override
	public void ligarTurbo() {
		this.ligarTurbo = true;
	}

	@Override
	public void desligarTurbo() {
		this.ligarTurbo = false;
	}

	@Override
	public void ligarAr() {
		this.ligarAr = true;
	}

	@Override
	public void desligarAr() {
		this.ligarAr = false;
	}
	
	@Override
	public int getDelta() {
		if(ligarTurbo && !ligarAr) {
			return 35;
		} else if(ligarTurbo && ligarAr) {
			return 30;
		} else if(!ligarTurbo && !ligarAr) {
			return 20;
		} else {
			return 15;
		}
	}
//	@Override
//	void acelerar() {
//		this.velocidadeAtual += 15;
//	}
//	
//	@Override
//	void frear() {
//		if(this.velocidadeAtual >= 15) {
//			this.velocidadeAtual -= 15;
//		} else {
//			this.velocidadeAtual = 0;
//		}
//	}
}
