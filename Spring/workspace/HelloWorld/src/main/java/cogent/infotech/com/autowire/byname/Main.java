package cogent.infotech.com.autowire.byname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("cogent/infotech/com/autowire/byname/config.xml");
		Person person = (Person)ctx.getBean("person");
		
		Car car = person.getCar();
		Address address = person.getAddress();
		System.out.println("Person car information:");
		System.out.println("car model: " + car.getModel());
		System.out.println("car price: " + car.getPrice());
		System.out.println("Person address information:");
		System.out.println("houseNo: " + address.getHouseNo());
		System.out.println("street: " + address.getStreet());
		System.out.println("city: " + address.getCity());
	}
}
