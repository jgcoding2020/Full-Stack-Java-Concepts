package functional_interfaces;

import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args){
		Supplier<Double> randomValue = ()->Math.random();
		System.out.println("Supplier functional interface test random value:");
		System.out.println(randomValue.get());
	}
}
