package cogent.infotech.com.lc;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractXmlApplicationContext ctx = new ClassPathXmlApplicationContext("cogent/infotech/com/lc/config.xml");
		Employee e = (Employee)ctx.getBean("employee");
		System.out.println(e);
		ctx.registerShutdownHook();
	}
}
