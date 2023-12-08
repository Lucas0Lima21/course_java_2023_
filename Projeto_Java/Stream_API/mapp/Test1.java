package mapp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Test1 {
	public static void main(String[] args) {
		Consumer<String> print = System.out::print;
		
		List<String> aList = Arrays.asList("jojo ", "mathias ", "julio");
		aList.stream().map(m -> m.toUpperCase()).forEach(print);
		
		System.out.println("\n");
		
		UnaryOperator<String> letter = m -> m.toUpperCase();

		UnaryOperator<String> firstLetter = m -> m.charAt(0) + "";
		
		UnaryOperator<String> sam = m -> m + " ";

		aList.stream().map(letter).map(firstLetter).map(sam).forEach(print);
		
	}
}