package vendas_produtos;

public class compratest {
	public static void main(String[] args) {
	
		// criando lista:
		Compra compra1 = new Compra();
		Compra compra2 = new Compra();
		// adicionando na lista:
		compra1.adicionarProduto("carro",1000, 2);
		compra1.adicionarProduto(new Produto("panela", 50), 2);
		
		compra2.adicionarProduto("moto",500, 2);
		compra2.adicionarProduto(new Produto("jogo", 10.10), 2);
		
		// criando cliente:
		Cliente cliente = new Cliente("joao");
		cliente.adiconarCompra(compra1);
		cliente.adiconarCompra(compra2);
		
		// testando valor Total:
		System.out.println("Valor Total: " + cliente.verValorTotal());
	}
	

}
