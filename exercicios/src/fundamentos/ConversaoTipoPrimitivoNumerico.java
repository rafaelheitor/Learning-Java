package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		double a = 1; //Conversão implicita
		System.out.println(a);
		
		float b = (float )1.12345; //conversão explicita (CAST)
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c; //conversão explicita (CAST)
		System.out.println(d);
		
		double e = 1.99999;
		int f = (int) e; //conversão explicita (CAST)
		System.out.println(f);
	}
}
