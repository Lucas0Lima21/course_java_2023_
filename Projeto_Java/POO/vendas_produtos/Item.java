package vendas_produtos;

public class Item {
	protected int quantidade;
	protected Produto produto;
	
	public Item() {
		this(null, 0);
	}
	public Item( Produto produto, int quantidade) {
		super();
		this.quantidade = quantidade;
		this.produto = produto;
	}
	
}
