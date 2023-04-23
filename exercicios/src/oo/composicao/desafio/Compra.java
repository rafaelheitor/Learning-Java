package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {

	ArrayList<Item> itens = new ArrayList<>();

	void adicionarItem(Item item) {
		this.itens.add(item);
	}

	double obterValorTotal() {
		double total = 0;
		for (Item item : this.itens) {
			total += item.quantidade * item.produto.preco;
		}

		return total;
	}
}
