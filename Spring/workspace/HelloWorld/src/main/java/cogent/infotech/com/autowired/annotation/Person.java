package cogent.infotech.com.autowired.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {

	private Car car;
	private Address address;
	
	@Autowired
	public Person(Car car, Address address) {
		super();
		this.car = car;
		this.address = address;
	}
	public Car getCar() {
		return car;
	}

	public Address getAddress() {
		return address;
	}
}
