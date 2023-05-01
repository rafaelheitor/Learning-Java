package generics;

public class CaixaNumeroTeste {
	public static void main(String[] args) {
	CaixaNumero<Integer> caixaA = new CaixaNumero<>();
		
		caixaA.guardar(10);
		Integer coisaA = caixaA.retirar();
		
		System.out.println(coisaA);
	
	}
}
