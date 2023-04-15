package fundamentos.exercicios;

import java.util.Scanner;

public class FahrenheitToCelsius {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the temperature in Fahrenheit to be converted to Celsius");
		double farenheit = in.nextDouble();
		final double ADJUSTMENT =  32;
		
		double celsius = (farenheit - ADJUSTMENT) / 1.8;
		System.out.println("The temperature in Celsius is: " + celsius + "ºC");
		
		in.close();
	}
}
