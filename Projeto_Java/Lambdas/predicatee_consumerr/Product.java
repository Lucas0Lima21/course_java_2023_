package predicatee_consumerr;

public class Product {
	String name;
	double value;
	double rebate;
	
	public Product(String name, double value, double rebate) {
		super();
		this.name = name;
		this.value = value;
		this.rebate = rebate;
	}
	 public String toString() {
		 double price = value - (value * rebate );
		 return name + ", value with rebate: " + price;
	 }
}
