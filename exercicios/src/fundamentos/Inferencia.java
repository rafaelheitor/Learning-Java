package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		double a = 5.9; //declaração e atríbuição
		
		System.out.println(a);
		a = 12; //reatribuição
		System.out.println(a);
		
		var b = 4.5; //Var é utilizado para possibilitar a inferência de tipos
		System.out.println(b);
		
		var c = "String";
		System.out.println(c);
		
		c = "Nova String";
		System.out.println(c);
		
		double d;
		d = 123.65;
		System.out.println(d);
	}
}
