package predicatee_consumerr;

import java.util.function.Predicate;

public class Predicate_Test {
	public static void main(String[] args) {
		Predicate<Integer> isEven = number -> number %2 ==0;
		Predicate<Integer> threeDigits = number -> number >=100 && number <= 999;
		
		System.out.println(isEven.and(threeDigits).negate().test(25));
		System.out.println(isEven.or(threeDigits).test(251));
	}

}
