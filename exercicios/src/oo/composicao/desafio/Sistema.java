package oo.composicao.desafio;

public class Sistema {

	public static void main(String[] args) {
		Produto produto1 = new Produto("Notebook", 3500);
		Item item1 = new Item(2, produto1);
		Compra compra1 = new Compra();
		compra1.adicionarItem(item1);
		
		Produto produto2 = new Produto("Ipad", 2000);
		Item item2 = new Item(1, produto2);
		Compra compra2 = new Compra();
		compra2.adicionarItem(item2);
		
		Cliente cliente1 = new Cliente("Maria");
		cliente1.adicionarCompra(compra1);
		cliente1.adicionarCompra(compra2);
		
		System.out.println(cliente1.obterValorTotal());
	}
}
