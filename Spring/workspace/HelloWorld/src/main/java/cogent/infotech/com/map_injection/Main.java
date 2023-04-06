package cogent.infotech.com.map_injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//Customer class collection map injection
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("cogent/infotech/com/map_injection/config.xml");
		Customer c = (Customer)ctx.getBean("customer");
		System.out.println("Customer id: " + c.getId());
		System.out.println("Products: " + c.getProducts());
	}
}