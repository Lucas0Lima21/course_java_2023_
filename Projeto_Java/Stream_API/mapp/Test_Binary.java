package mapp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Test_Binary {
	public static void main(String[] args) {
		
		List<Integer> number = Arrays.asList(1, 2, 3 , 4, 5, 6, 7, 8, 9);
		UnaryOperator<String> transform = 
				s -> new StringBuilder(s).reverse().toString();
		Function<String, Integer> tonumber = s ->Integer.parseInt(s,2);;	
		
		number.stream()
		.map(Integer::toBinaryString)
		.map(transform)
		.map(tonumber)
		.forEach(System.out::println);

	}

}
