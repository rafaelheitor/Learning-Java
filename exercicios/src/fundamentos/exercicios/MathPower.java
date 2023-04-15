package fundamentos.exercicios;

import java.util.Scanner;

public class MathPower {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the number to be used");
		int number = in.nextInt();		
		int squared = (int) Math.pow(number, 2);
		int cubed = (int) Math.pow(number, 3);
		System.out.println("The number squared is " + squared);
		System.out.println("The number cubed is " + cubed);
		
		in.close();
	}
}
