package predicatee_consumerr;

import java.util.function.Predicate;

public class Test1 {
	public static void main(String[] args) {
		Predicate<Product> ischeap = 
				product ->(product.value -(product.value * product.rebate ) >= 1500);
				
		Product product1 = new Product("car",5000.0,0.30);
		Product product2 = new Product("VideoGameConsole",1750.5,0.30);
		
		System.out.println(ischeap.test(product1));
		System.out.println(ischeap.test(product2));

	}

}
