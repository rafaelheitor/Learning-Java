package generics;

public class CaixaTeste {

	public static void main(String[] args) {
		
		Caixa<String> caixaA = new Caixa<>();
		
		caixaA.guardar("Segredo A");
		String coisaA = caixaA.retirar();
		
		System.out.println(coisaA);
		
		Caixa<Double> caixaB = new Caixa<>();
		
		caixaB.guardar(2.1);
		Double coisaB = caixaB.retirar();
		
		System.out.println(coisaB);
	}
}
