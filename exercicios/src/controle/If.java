package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Informe a nota: ");
		double nota = in.nextDouble();
		
		 

		if (nota > 10 || nota < 0) {
			System.out.println("Nota inválida");
		}else if (nota >=7) {			
			System.out.println("Aprovado");
		}else if(nota >= 5) {
			System.out.println("Em recuperação");
			
		}else {
			System.out.println("Reprovado");
		}
		in.close();
	}
}
