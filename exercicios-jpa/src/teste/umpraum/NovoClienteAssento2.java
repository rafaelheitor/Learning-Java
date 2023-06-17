package teste.umpraum;

import infrastructure.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento2 {

	public static void main(String[] args) {
		Assento assento = new Assento("25C");
		Cliente cliente = new Cliente("João", assento);
		
		DAO<Cliente> dao = new DAO<>();
		dao.incluirAtomico(cliente);
	}
}
