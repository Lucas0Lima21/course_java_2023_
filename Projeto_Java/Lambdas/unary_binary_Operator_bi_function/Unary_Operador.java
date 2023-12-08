package unary_binary_Operator_bi_function;

import java.util.function.UnaryOperator;

public class Unary_Operador {
	public static void main(String[] args) {
		UnaryOperator<Integer> samTwo = number -> number + 2;
		UnaryOperator<Integer> timestwo = number -> number * 2;
		UnaryOperator<Integer> squared = number -> number *number;
		
		double valueFinal = samTwo.andThen(timestwo).andThen(squared).apply(0);
		double valueFinal1 = squared.compose(timestwo).compose(samTwo).apply(0);
		
		System.out.println(valueFinal);
		System.out.println(valueFinal1);

		
	}

}
