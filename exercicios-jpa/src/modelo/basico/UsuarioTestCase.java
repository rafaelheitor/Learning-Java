package modelo.basico;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class UsuarioTestCase {

	@Test
	void criarUsuario() {
		Usuario usuario1 = new Usuario("Rafael", "rafael@email.com");
		
		assertTrue(usuario1.getNome().equals("Rafael"));
		assertTrue(usuario1.getEmail().equals("rafael@email.com"));
	}
	
	@Test
	void editarUsuario() {
		Usuario usuario1 = new Usuario("Rafael", "rafael@email.com");
		usuario1.setNome("Jão");
		usuario1.setEmail("jao@email.com");
		assertTrue(usuario1.getNome().equals("Jão"));
		assertTrue(usuario1.getEmail().equals("jao@email.com"));
	}

}
