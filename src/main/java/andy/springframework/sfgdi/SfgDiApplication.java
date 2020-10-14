package andy.springframework.sfgdi;

import andy.springframework.sfgdi.controllers.ConstructorInjectionController;
import andy.springframework.sfgdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

        MyController myController = (MyController) ctx.getBean("myController");
        String greeting = myController.sayHello();

        System.out.println(greeting);


        ConstructorInjectionController constructorInjectionController =
                (ConstructorInjectionController) ctx.getBean("constructorInjectionController");

        System.out.println(constructorInjectionController.sayGreeting());
    }

}
