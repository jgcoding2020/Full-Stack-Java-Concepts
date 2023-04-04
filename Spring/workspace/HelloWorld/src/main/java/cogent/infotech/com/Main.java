package cogent.infotech.com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
		Student s = (Student)ctx.getBean("student");
		System.out.println("Student Scores: " + s.getScores());
		
		// Customer class collection map injection
//		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
//		Customer c = (Customer)ctx.getBean("customer");
//		System.out.println("Customer id: " + c.getId());
//		System.out.println("Products: " + c.getProducts());
		
		// Hospital class collection list injection
//		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
//		Hospital h = (Hospital)ctx.getBean("hospital");
//		System.out.println("Hospital name: " + h.getName());
//		System.out.println("Department: " + h.getDepartment());
//		System.out.println("Department: " + h.getDepartment().getClass());
		
		// Person class setter and constructor based injection
//		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
//		Person p = (Person)ctx.getBean("person");
//		System.out.println("Person id: " + p.getId());
//		System.out.println("Person name: " + p.getName());
//		System.out.println("Person age: " + p.getAge());
		
		/* Employee class fields set in config.xml bean tag
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
		Employee emp = (Employee)ctx.getBean("emp");
		System.out.println("Employee id: " + emp.getId());
		System.out.println("Employee name: " + emp.getName());
		*/
		
		/* Greeting class injection
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
		Greeting g=(Greeting)ctx.getBean("hello");
		String str=g.message();
		System.out.println(str);
  		*/
	}
}