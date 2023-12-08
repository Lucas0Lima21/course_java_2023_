package vendas_produtos;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	String nome; 
	List<Compra> compras = new ArrayList<>();
	public Cliente(String nome) {
		super();
		this.nome = nome;
	}
	
	void adiconarCompra(Compra compra) {
		this.compras.add(compra);
	}
	double verValorTotal() {
		double valorTotal = 0; 
		for(Compra compraAtual : compras){
			valorTotal += compraAtual.verValorTotal();
		}
		return valorTotal;
	}
	

}
