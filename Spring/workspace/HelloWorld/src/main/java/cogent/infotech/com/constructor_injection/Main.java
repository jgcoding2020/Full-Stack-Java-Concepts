package cogent.infotech.com.constructor_injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//Person class constructor based injection
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("cogent/infotech/com/constructor_injection/config.xml");
		Person p = (Person)ctx.getBean("person");
		System.out.println("Person id: " + p.getId());
		System.out.println("Person name: " + p.getName());
		System.out.println("Person age: " + p.getAge());
	}
}