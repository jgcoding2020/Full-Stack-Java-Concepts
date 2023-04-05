package cogent.infotech.com.qualifier;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("cogent/infotech/com/qualifier/config.xml");
		Employee e = (Employee)ctx.getBean("employee");
		System.out.println(e);
	}

}
