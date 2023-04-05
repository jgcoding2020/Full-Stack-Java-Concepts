package cogent.infotech.com.annotations;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("cogent.infotech.com.annotations")
public class Main {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(Main.class);
		ChatService chatService = ctx.getBean(ChatService.class);
		
		chatService.chat();
		ctx.close();
	}
}
