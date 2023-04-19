package classe;

public class Equals {

	public static void main(String[] args) {
		Usuario usuario1 = new Usuario();
		usuario1.nome = "Jonata";
		usuario1.email = "jonata@email.com";
		
		Usuario usuario2 = new Usuario();
		usuario2.nome = "Jonata";
		usuario2.email = "jonata@email.com";
		
		System.out.println(usuario1 == usuario2);
		System.out.println(usuario1.equals(usuario2));
	}
}
