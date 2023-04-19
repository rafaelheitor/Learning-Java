package arrays;

public class ForEach {

	public static void main(String[] args) {
		double[] notas = {9.0, 9.2, 9.1, 9.4};
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
		
		System.out.println();
		
		for(double nota: notas) {
			System.out.println(nota);
		}
	}
}
