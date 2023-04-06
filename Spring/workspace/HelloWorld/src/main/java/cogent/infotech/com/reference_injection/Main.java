package cogent.infotech.com.reference_injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("cogent/infotech/com/reference_injection/config.xml");
		Student s = (Student)ctx.getBean("student");
		System.out.println("Student Scores: " + s.getScores());
	}
}