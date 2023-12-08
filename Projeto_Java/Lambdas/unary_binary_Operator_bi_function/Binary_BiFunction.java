package unary_binary_Operator_bi_function;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Binary_BiFunction {
	public static void main(String[] args) {
		BinaryOperator<Double> average = ( n1, n2) -> (n1 + n2 )/ 2;
		BiFunction<Double,Double,String> result = ( n1, n2) ->((n1 + n2 )/ 2) >= 7 ? "Aprovado" : "Reprovado";
		
		
		Function<Double, String> result1 = m -> m >= 7 ? "Aprovado" : "Reprovado";
		
		System.out.println(result.apply(9.2, 6.4));
		
		System.out.println(average.andThen(result1).apply(2.0, 8.2));
	}
		
}
