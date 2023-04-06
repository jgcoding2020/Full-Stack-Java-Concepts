package cogent.infotech.com.list_injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//collection list injection
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("cogent/infotech/com/list_injection/config.xml");
		Hospital h = (Hospital)ctx.getBean("hospital");
		System.out.println("Hospital name: " + h.getName());
		System.out.println("Department: " + h.getDepartment());
		System.out.println("Department: " + h.getDepartment().getClass());
	}
}