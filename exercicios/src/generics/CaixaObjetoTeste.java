package generics;

public class CaixaObjetoTeste {

	public static void main(String[] args) {
		CaixaObjeto caixaA = new CaixaObjeto();
		
		caixaA.guardar(2.3);
		
		Double coisa = (Double) caixaA.retirar();
		System.out.println(coisa);
		
		CaixaObjeto caixaB = new CaixaObjeto();
		
		caixaB.guardar("Hello World");
		
		String coisaB = (String) caixaB.retirar();
		System.out.println(coisaB);
	}
}
