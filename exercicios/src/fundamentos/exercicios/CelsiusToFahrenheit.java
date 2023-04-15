package fundamentos.exercicios;

import java.util.Scanner;

public class CelsiusToFahrenheit {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the temperature in Celsius to be converted to Fahreinheit");
		double celsius = in.nextDouble();
		final double ADJUSTMENT =  32;
		double fahreinheit = celsius * 1.8 + ADJUSTMENT;
		
		System.out.println("The temperature in fareinheit is: " + fahreinheit + "ºF");
		in.close();
	}
}
