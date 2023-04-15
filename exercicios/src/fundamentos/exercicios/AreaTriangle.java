package fundamentos.exercicios;

import java.util.Scanner;

public class AreaTriangle {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the triangle base");
		double base = in.nextDouble();
		System.out.println("Enter the triangle height");
		double height = in.nextDouble();
		
		double area = (base * height) / 2;
		System.out.println("The tirangle area is " + area);
		
		
		in.close();
	}
}
