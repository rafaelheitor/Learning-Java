package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		Compra compra1 = new Compra();
		
		compra1.cliente = "João Paulo";
		compra1.adicionarItem( new Item("Camisa", 2, 19.90));
		compra1.adicionarItem(new Item("Bermuda", 1, 25.90));
		compra1.adicionarItem(new Item("Sandália", 1, 30.90));
		
		System.out.println(compra1.itens.size());
		System.out.println(compra1.obterTotal());
	}
}
