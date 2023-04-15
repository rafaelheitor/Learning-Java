package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero");
		double num1 = in.nextDouble();
		
		System.out.println("Digite o primeiro segundo numero");
		double num2 = in.nextDouble();

		System.out.println("Qual operação você deseja realizar?");
		String simbolo = in.next();

		double resultado = simbolo.equals("+") ? num1 + num2 : 0;
		resultado = simbolo.equals("-") ? num1 - num2 : resultado;
		resultado = simbolo.equals("*") ? num1 * num2 : resultado;
		resultado = simbolo.equals("/") ? num1 / num2 : resultado;
		resultado = simbolo.equals("%") ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, simbolo, num2, resultado);

		in.close();
	}
}
