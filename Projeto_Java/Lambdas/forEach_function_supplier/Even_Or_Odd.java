package forEach_function_supplier;

import java.util.function.Function;

public class Even_Or_Odd {
	public static void main(String[] args) {
		Function<Integer, String> evenOrOdd = number -> number %2 == 0 ? "Even" : "Odd";
		
		System.out.println(evenOrOdd.apply(32));
		
		Function<String , String> result = value -> "the result: " + value;
		
		Function<String , String> result1 = value -> value + "!!!" ;
		
		String resultFinal = evenOrOdd.andThen(result).andThen(result1).apply(32);
		
		System.out.println(resultFinal);
	}

}
