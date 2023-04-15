package fundamentos.exercicios;

import java.util.Scanner;

public class IMCCalculator {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your height");
		double height = in.nextDouble();
		
		System.out.println("Please enter your weight");
		double weight = in.nextDouble();
		
		double imc = weight /  Math.pow(height, 2);
		
		System.out.println("Your IMC is: " + imc);
		in.close();
	}
}
