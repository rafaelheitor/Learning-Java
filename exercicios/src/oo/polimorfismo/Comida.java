package oo.polimorfismo;

public abstract class Comida {
	protected double peso;

	protected Comida(double peso) {
		setPeso(peso);
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (this.peso >= 0) {
			this.peso = peso;
		}
	}

}
