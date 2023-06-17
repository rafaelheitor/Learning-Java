package teste.umpraum;

import infrastructure.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class ObterClienteAssento {

	public static void main(String[] args) {
		DAO<Cliente> dao = new DAO<>(Cliente.class); 
		
		Cliente cliente = dao.obterUm(1L);
		System.out.println(cliente.getAssento().getNome());
		System.out.println(cliente.getAssento().getCliente().getNome());
		
		DAO<Assento> daoAssento = new DAO<>(Assento.class); 
		Assento assento = daoAssento.obterUm(1L);
		System.out.println(assento.getCliente().getNome());
	}
}
