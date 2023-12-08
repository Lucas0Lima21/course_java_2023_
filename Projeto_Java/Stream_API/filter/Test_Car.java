package filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test_Car {
	public static void main(String[] args) {
		Car c1 = new Car("GolG7", 1800, 5);
		Car c2 = new Car("Civic", 3000, 8);
		Car c3 = new Car("GolBola", 1000, 5);
		Car c4 = new Car("Saveiro", 1300, 2);
		
		
		List<Car> anList = Arrays.asList(c1, c2, c3, c4);
		
		Predicate<Car> isCheap = c -> c.value <= 1500;
		Predicate<Car> lastDays = c -> c.rentedDays <=5;
		
		Function<Car , String> text = t -> t.name + " - price - " + t.value + " - days - "+ t.rentedDays;
		
		anList.stream().filter(isCheap).filter(lastDays).map(text).forEach(System.out::println);


		
	}

	

}
