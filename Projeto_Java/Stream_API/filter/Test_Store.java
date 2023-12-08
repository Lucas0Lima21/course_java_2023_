package filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test_Store {
	public static void main(String[] args) {
		Store p1 =  new Store("short", 100, 0.30, true);
		Store p2 =  new Store("Jacket", 150, 0.25, true);
		Store p3 =  new Store("T-shirt", 200, 0.10, false);
		Store p4 =  new Store("shirt", 80, 0.50, true);
		
		List<Store> anList = Arrays.asList(p1, p2, p3, p4);
		Predicate<Store> rebate = r -> r.rebate >= 0.30;
		Predicate<Store> freight = r -> r.freight;
		Function<Store , String> text = t -> t.Product + " - price - " + 
		t.value + " - rebate - "+ t.rebate + " - freight - " + t.freight;

		
		anList.stream().filter(rebate).filter(freight).map(text).forEach(System.out::println);


	}

}
