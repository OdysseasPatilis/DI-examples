package patis.odysspring.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import patis.odysspring.sfgdi.controllers.MyController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(SfgDiApplication.class, args);
		MyController myController=(MyController) ctx.getBean("myController");
		String greeting =myController.dayHello();
		System.out.println(greeting);
	}

}
