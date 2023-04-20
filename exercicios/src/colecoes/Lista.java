package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		
		ArrayList<Usuario> listaDeUsuarios = new ArrayList<>();
		
		Usuario usuario1 = new Usuario("Joana");
		Usuario usuario2 = new Usuario("João");
		Usuario usuario3 = new Usuario("Maria");
		Usuario usuario4 = new Usuario("Jose");
		Usuario usuario5 = new Usuario("Tadeu");
		
		
		listaDeUsuarios.add(usuario1);
		listaDeUsuarios.add(usuario2);
		listaDeUsuarios.add(usuario3);
		listaDeUsuarios.add(usuario4);
		listaDeUsuarios.add(usuario5);
		
		System.out.println(listaDeUsuarios.get(4)); //retorna o usuário
		
		System.out.println(listaDeUsuarios.remove(3)); // retorna o usuário removido
		System.out.println(listaDeUsuarios.remove(usuario1)); // retorna o true
		System.out.println(listaDeUsuarios.contains(usuario5));
		
		for(Usuario user: listaDeUsuarios) {
			System.out.println(user.nome);
		}
	}
}
