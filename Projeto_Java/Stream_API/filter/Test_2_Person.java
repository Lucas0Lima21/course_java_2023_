package filter;

import java.util.Arrays;
import java.util.List;

public class Test_2_Person {
	public static void main(String[] args) {
		 Person p1 = new Person("jose", 7.5);
		 Person p2 = new Person("pedro", 5.5);
		 Person p3 = new Person("joana", 8.5);
		 Person p4 = new Person("clara", 6.5);
		 Person p5 = new Person("joj", 9.5);
		 Person p6 = new Person("pedro", 5.5);
		 Person p7 = new Person("joana", 8.5);
		 Person p8 = new Person("clara", 6.5);
		 
		 List<Person> anList = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8);
		 
		 anList.stream().distinct().forEach(System.out::println);
		 System.out.println("\n");
		 anList.stream().skip(1).limit(2).forEach(System.out::println);
		 System.out.println("\n");
		 anList.stream().skip(2).takeWhile(n -> n.note >= 6).forEach(System.out::println);

	}	
}
