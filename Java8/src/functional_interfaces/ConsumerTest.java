package functional_interfaces;

import java.util.function.Consumer;

public class ConsumerTest {
	
	public static void main(String[] args) {
		Consumer<String> c = (x)->System.out.println(x.toUpperCase());
		
		System.out.println("Testing Consumer functional interface:");
		c.accept("this is the end!!!");
	}
}
