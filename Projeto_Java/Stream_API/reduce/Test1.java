package reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Test1 {
	public static void main(String[] args) {
		 List<Integer> anList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		 
		 BinaryOperator<Integer> sam = (ac, s) -> ac + s;
		 
		 Integer number = anList.parallelStream().reduce(sam).get();
		 System.out.println(number);
		 
		 Integer number1 = anList.stream().reduce(0 ,sam);
		 System.out.println(number1);
		 
		 anList.stream().filter(n -> n >= 0 && n <= 10).reduce(sam).ifPresent(System.out::println);
		 
	}

}
