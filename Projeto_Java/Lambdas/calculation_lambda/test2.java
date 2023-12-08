package calculation_lambda;

import java.util.function.BinaryOperator;

public class test2 {
	
	public static void main(String[] args) {
		
		BinaryOperator<Double> Calcu = (x, y) -> { return x + y; };
		
		System.out.println("Sam : " + Calcu.apply(2.0, 5.0));
		
		Calcu =(x, y) ->  x * y;
		
		System.out.println("Times : " +Calcu.apply(2.0, 5.0));
		//
		//
		BinaryOperator<Integer> Calcul = (x, y) -> { return x + y; };
		
		System.out.println("Sam : " + Calcul.apply(2, 5));
		
		Calcul =(x, y) ->  x * y;
		
		System.out.println("Times : " +Calcul.apply(2, 5));
	}
 
	

}
