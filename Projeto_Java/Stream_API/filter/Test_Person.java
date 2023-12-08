package filter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test_Person {
	public static void main(String[] args) {
		 Person p1 = new Person("jose", 7.5);
		 Person p2 = new Person("pedro", 5.5);
		 Person p3 = new Person("joana", 8.5);
		 Person p4 = new Person("clara", 6.5);
		 Person p5 = new Person("joj", 9.5);
		 
		 List<Person> anList = Arrays.asList(p1, p2, p3, p4, p5);
		 
		 Predicate<Person> approved = a -> a.note >= 7;
		 Predicate<Person> disapproved =  approved.negate();
		 Function<Person, String> listAprro =
				 a -> a.name +" is approved and note :" + a.note;
				 
		Comparator<Person> maxNote= (P1, P2) -> {
			if( P1.note > P2.note) return 1;
			if( P1.note < P2.note) return -1;
			return 0;
		};
		
		Comparator<Person> minNote= (P1, P2) -> {
			if( P1.note > P2.note) return -1;
			if( P1.note < P2.note) return 1;
			return 0;
		};
		 
		anList.stream().filter(approved).map(listAprro).forEach(System.out::println);
		
		System.out.println(anList.stream().max(maxNote).get());
		System.out.println(anList.stream().max(minNote).get());

		System.out.println(anList.stream().min(maxNote).get());
		System.out.println(anList.stream().min(minNote).get());
		
		System.out.println(anList.stream().allMatch(approved));
		System.out.println(anList.stream().anyMatch(approved));
		System.out.println(anList.stream().noneMatch(disapproved));

	}

}
