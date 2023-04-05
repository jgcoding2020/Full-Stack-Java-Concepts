package cogent.infotech.com.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("cogent/infotech/com/assignment/config.xml");
		University u = (University)ctx.getBean("university");
		System.out.println("This is u hashcode: ");
		System.out.println(u.hashCode());
		
		University u2 = (University)ctx.getBean("university");
		System.out.println("This is u2 hashcode: ");
		System.out.println(u2.hashCode());
	}

}
