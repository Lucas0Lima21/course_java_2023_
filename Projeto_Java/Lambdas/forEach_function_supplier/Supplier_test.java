package forEach_function_supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Supplier_test {
	public static void main(String[] args) {
		
		Supplier<List<String>> aList = () -> Arrays.asList("joao" , "matheus", "joana");
		
		System.out.println("An people List: " + aList.get());
	}
	

}
