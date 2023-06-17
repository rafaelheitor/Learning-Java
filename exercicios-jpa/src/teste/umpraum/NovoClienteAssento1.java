package teste.umpraum;

import infrastructure.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento1 {

	public static void main(String[] args) {
		Assento assento = new Assento("18F");
		Cliente cliente = new Cliente("Joana", assento);
		
		DAO<Object> dao = new DAO<>();
		
		dao.abrirTransacao()
		.incluir(assento)
		.incluir(cliente)
		.fecharTransacao();

	}
}
