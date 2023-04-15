package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// (ºF - 32) x 5/9 = ºC
		final int AJUSTE = 32;
		final double FATOR = 5/9.0;
		int fahrenheit = 86;
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		
		System.out.println("O resultado é: " + celsius + "ºC");
	}
}
