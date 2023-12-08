package testes_itelador_stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class People {
	public static void main(String[] args) {
		List<String> aList = Arrays.asList("carlos", "gui","tami" ,"luke");
		System.out.println("list ForEach:");
		for(String list : aList) {
			System.out.println(list);
		}
		
		System.out.println("\nlist Itelador:");
		Iterator<String> list = aList.iterator();
		while(list.hasNext()) {
			System.out.println(list.next());
		}
		
		System.out.println("\nlist Stream:");
		Stream<String> listt = aList.stream();
		listt.forEach(System.out::println);
	}

}
