package calculation_lambda;

public class test1 {
	public static void main(String[] args) {
		
		Calculation Calcu = (x, y) -> { return x + y; };
		
		System.out.println("Sam : " + Calcu.Execute(2, 5));
		
		Calcu =(x, y) ->  x * y;
		
		System.out.println("Times : " +Calcu.Execute(2, 5));
	}

}
