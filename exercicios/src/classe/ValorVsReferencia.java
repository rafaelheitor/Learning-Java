package classe;

public class ValorVsReferencia {
	public static void main(String[] args) {
		double a = 2;
		double b = a; //atribuição por valor
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		Data d1 = new Data(22, 8, 2020);
		Data d2 = d1; //atribuiçao por referência (Objeto)
		
		d1.dia = 30;
		d2.mes = 11;
		d1.ano = 2025;
		
		System.out.println(d1.obterData());
		System.out.println(d2.obterData());
		
		voltarDataPadrao(d1);
		
		System.out.println(d1.obterData());
		System.out.println(d2.obterData());
		
		int c = 9;
		alterarPrimitivo(c);
		System.out.println(c);
	}
	
	static void voltarDataPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	
	static void alterarPrimitivo(int a) {
		a++;
	}
}
