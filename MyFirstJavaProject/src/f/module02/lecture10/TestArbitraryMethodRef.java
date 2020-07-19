package f.module02.lecture10;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class TestArbitraryMethodRef {

	public static void main(String[] args) {

		List names = new ArrayList();
		names.add("Elinka");
		names.add("Gergana");
		names.add("Deni");
		names.add("Voyko");
		names.add("Dimitar");

		names.forEach(System.out::println);
		
		Function<String, Double> convertDouble = Double::parseDouble;
		System.out.println("\n\nMethod reference example: " + convertDouble.apply("0.3654"));
		
	}

}
