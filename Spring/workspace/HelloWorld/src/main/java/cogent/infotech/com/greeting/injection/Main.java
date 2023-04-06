package cogent.infotech.com.greeting.injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		//Greeting class injection
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("cogent/infotech/com/greeting/injection/config.xml");
		Greeting g=(Greeting)ctx.getBean("hello");
		System.out.println(g.message());
	}
}