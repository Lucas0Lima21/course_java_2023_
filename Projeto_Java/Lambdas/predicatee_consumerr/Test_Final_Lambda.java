package predicatee_consumerr;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Test_Final_Lambda {
	public static void main(String[] args) {
		
		Function<Product, Double> pricee = p -> p.value - (1* p.rebate);
		
		UnaryOperator<Double> propertytax = value -> value >= 2500 ? value * 1.085 : value;
		
		UnaryOperator<Double> freight = value -> value >= 3000 ? value + 100 : value +50;
		
		UnaryOperator<Double> defaul = value -> Double.parseDouble(String.format(Locale.ENGLISH, "%.2f", value));
		
		Function<Double, String> resultFinal = value -> ("R$ "+ value).replace(".", ",");
		
		Product product1  = new Product("house", 1000.00, 0.10);
		String result = pricee
				.andThen(propertytax)
				.andThen(freight)
				.andThen(defaul)
				.andThen(resultFinal)
				.apply(product1);
		
		System.out.println(result);



	}

}
