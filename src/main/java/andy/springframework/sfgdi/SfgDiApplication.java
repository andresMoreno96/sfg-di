package andy.springframework.sfgdi;

import andy.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
        I18nController i18nController = (I18nController) ctx.getBean("i18nController");
        System.out.println(i18nController.sayGreeting());


        MyController myController = (MyController) ctx.getBean("myController");
        System.out.println("----Primary Bean----");
        System.out.println(myController.sayHello());

        System.out.println("----Property----");
        PropertyInjectionController propertyInjectionController = (PropertyInjectionController) ctx.getBean("propertyInjectionController");
        System.out.println(propertyInjectionController.getGreeting());

        System.out.println("----Setter----");
        SetterInjectionController setterInjectionController = (SetterInjectionController) ctx.getBean("setterInjectionController");
        System.out.println(setterInjectionController.getGreeting());


        System.out.println("----Constructor----");
        ConstructorInjectionController constructorInjectionController =
                (ConstructorInjectionController) ctx.getBean("constructorInjectionController");

        System.out.println(constructorInjectionController.sayGreeting());
    }

}
