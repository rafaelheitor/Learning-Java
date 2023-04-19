package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Quantos alunos");
		int quantidadeAlunos = scanner.nextInt();
		
		System.out.println("Quantas notas por aluno?");
		int quantidadeDeNotas = scanner.nextInt();
		
		double[][] notasDaTurma = new double[quantidadeAlunos][quantidadeDeNotas];
		
		double total = 0;
		
		for (int i = 0; i < notasDaTurma.length; i++) {
			for (int j = 0; j < notasDaTurma[i].length; j++) {
				
				System.out.printf("Informe a nota %d do aluno %d: ", j + 1, i + 1);
				notasDaTurma[i][j] = scanner.nextDouble();
				total += notasDaTurma[i][j];
			}
		}

		for(double[] notasDoAluno: notasDaTurma) {
			System.out.println(Arrays.toString(notasDoAluno));
		}
		double media = total / (quantidadeAlunos * quantidadeDeNotas);
		System.out.println("A média da turma é: " + media);
		scanner.close();
	}
}
