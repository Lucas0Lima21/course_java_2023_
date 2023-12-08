package testes_itelador_stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Creating_Stream {
	public static void main(String[] args) {
		Consumer<String> print = System.out::print;
		
		Stream<String> langs = Stream.of("JS ","Java ", "Python\n");
		langs.forEach(print);
		
		String[] morelangs = { "Go ", "C+\n" };
		
		Stream.of(morelangs).forEach(print);
		Arrays.stream(morelangs).forEach(print);
		
		List<String> listLangs = Arrays.asList("cansei");
		listLangs.parallelStream().forEach(print);
		listLangs.stream().forEach(print);
	}

}
