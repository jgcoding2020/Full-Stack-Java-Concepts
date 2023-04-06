package cogent.infotech.com.bean_tag_field_setting;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		// Employee class fields set in config.xml bean tag
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("cogent/infotech/com/bean_tag_field_setting/config.xml");
		Employee emp = (Employee)ctx.getBean("emp");
		System.out.println("Employee id: " + emp.getId());
		System.out.println("Employee name: " + emp.getName());
		
	}
}