package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class NovoUsuario {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		Usuario novousuario = new Usuario("João", "joão@email.com");
		Usuario novousuario2 = new Usuario("Marcelo", "marcelo@email.com");
		Usuario novousuario3 = new Usuario("Igor", "igor@email.com");
		em.getTransaction().begin();
		em.persist(novousuario);
		em.persist(novousuario2);
		em.persist(novousuario3);
		em.getTransaction().commit();
		
		System.out.println("O usuario gerado foi: " + novousuario.getId());
		System.out.println("O usuario gerado foi: " + novousuario2.getId());
		System.out.println("O usuario gerado foi: " + novousuario3.getId());
		em.close();
		emf.close();
	}
}
