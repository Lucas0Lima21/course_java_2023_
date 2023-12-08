package forEach_function_supplier;

import java.util.Arrays;
import java.util.List;

public class ForEach {
	public static void main(String[] args) {
		
		List<String> Approved = Arrays.asList("joao", "Pedro", "Martias", "Joana");
		
		System.out.println("List default :");
		
		for(String name : Approved) {
			System.out.println(name);
		}
		
		// with lambda:
		System.out.println("\nList with Lambda: ");
		
		Approved.forEach((nome) ->{ System.out.println(nome); });
		
		Approved.forEach((nome) -> text(nome));

		// with method reference:
		
		System.out.println("\nList with method reference: ");
		
		Approved.forEach(System.out::println);
		Approved.forEach(ForEach::text);
		
	}
	static void text(String name) {
		System.out.println("ola, me chamo " + name) ;
	}

}
