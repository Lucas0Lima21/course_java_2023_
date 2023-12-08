package vendas_produtos;

public class Produto {
	protected String nome;	
	protected double preco;
	
	public String getNome() {
		return nome;
	}
	
	public Produto() {
		this(null,0);
	}

	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
}
	
