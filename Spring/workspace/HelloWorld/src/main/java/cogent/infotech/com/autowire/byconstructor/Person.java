package cogent.infotech.com.autowire.byconstructor;

public class Person {

	private Car car;
	private Address address;
	
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
