package cogent.infotech.com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		Person p = (Person)ctx.getBean("person");
		System.out.println("Person id: " + p.getId());
		System.out.println("Person name: " + p.getName());
		System.out.println("Person age: " + p.getAge());
		
		Product prod = (Product)ctx.getBean("product");
		System.out.println("Product id: " + prod.getpId());
		System.out.println("Product name: " + prod.getpName());
		System.out.println("Product price: " + prod.getpPrice());
	}
}
