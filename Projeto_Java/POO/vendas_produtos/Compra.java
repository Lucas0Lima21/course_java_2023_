package vendas_produtos;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	protected List<Item> itens = new ArrayList<>();
	
	void adicionarProduto(Produto produto,int qt) {
		this.itens.add(new Item(produto, qt));
	}

	void adicionarProduto(String nome, double preco, int qt ) {
		var produto = new Produto(nome, preco);
		this.itens.add(new Item(produto, qt));
	}
	
	double verValorTotal() {
		double valorTotal = 0; 
		for(Item item : itens){
			valorTotal += item.quantidade * item.produto.preco;
		}
		return valorTotal;
	}

}
