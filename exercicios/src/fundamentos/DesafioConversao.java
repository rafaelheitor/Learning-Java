package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Informe o primeiro salario: ");
		String primeiroSalario = in.next().replace("," , ".");
		
		System.out.print("Informe o segundo salario: ");
		String segundoSalario = in.next().replace("," , ".");
		
		System.out.print("Informe o terceiro salario: ");
		String terceiroSalario = in.next().replace("," , ".");
		
		double salario1 = Double.parseDouble(primeiroSalario);
		double salario2 = Double.parseDouble(segundoSalario);
		double salario3 = Double.parseDouble(terceiroSalario);
		
		double media = (salario1 + salario2 + salario3) / 3;
		
		System.out.println("A média dos salarios é: " + media);
		in.close();
	}
}
