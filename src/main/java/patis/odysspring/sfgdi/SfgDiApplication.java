package patis.odysspring.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import patis.odysspring.sfgdi.controllers.ConstructorInjectedController;
import patis.odysspring.sfgdi.controllers.MyController;
import patis.odysspring.sfgdi.controllers.PropertyInjectedController;
import patis.odysspring.sfgdi.controllers.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(SfgDiApplication.class, args);
		MyController myController=(MyController) ctx.getBean("myController");
		String greeting =myController.dayHello();
		System.out.println(greeting);
		System.out.println("--------------Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("-------------Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("-------------Constructor");
		ConstructorInjectedController constructorInjectedController= (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());


	}

}
