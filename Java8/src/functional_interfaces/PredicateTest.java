package functional_interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {
	
	public static void main(String[] args){
		List<String> names = Arrays.asList("Tom","Tony","Taryn","James","Sally"); 
		
		Predicate<String> p = (s) ->s.startsWith("T");
		
		System.out.println("Predicate functional interface test:");
		for (String str: names) {
			if (p.test(str))
				System.out.println(str);
		}
	}
}
