package oo.composicao.desafio;

import java.util.ArrayList;

public class Cliente {

	String nome;
	ArrayList<Compra> compras = new ArrayList<>();
	
	Cliente(String nome){
		this.nome = nome;
	}

	double obterValorTotal() {
		double total = 0;

		for (Compra compra : this.compras) {
			total += compra.obterValorTotal();
		}

		return total;
	}
	
	void adicionarCompra(Compra compra) {
		this.compras.add(compra);
	}
}
