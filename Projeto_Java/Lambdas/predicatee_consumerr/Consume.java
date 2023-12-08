package predicatee_consumerr;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consume {
	
	public static void main(String[] args) {
		Consumer<Product> name = product -> System.out.println(product.name);
		
		Product p1 = new Product("car", 1000.0, 0.25);
		Product p2 = new Product("house", 100000.0, 0.15);
		Product p3 = new Product("Dog", 800.0, 0.10);
		Product p4 = new Product("jacket", 150.0, 0.30);
		
		name.accept(p1);
		
		List<Product> product = Arrays.asList(p1, p2, p3, p4);
		
		product.forEach(name);
		
		product.forEach(p ->System.out.println(p.value));
		
		product.forEach(System.out::println);
		
		
	}

}
