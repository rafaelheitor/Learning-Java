package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		String string = "Java is X";
		
		string = string.replace("X", "Awesome");
		string = string.toUpperCase();
		string = string.concat("!!!");
		
		System.out.println(string);
		
		 String name = "Rafael"
				.toUpperCase()
				.replace("A", "4")
				.replace("E", "3")
				.concat(" Developer");

		System.out.println(name);
	}
}
