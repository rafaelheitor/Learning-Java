package stream;

public class MediaTeste {

	public static void main(String[] args) {
		Media m1 = new Media().adicionar(9.1).adicionar(6.1);
		Media m2 = new Media().adicionar(8.1).adicionar(9.1);
		
		System.out.println(Media.combinar(m1, m2).getValor());
	}
}
