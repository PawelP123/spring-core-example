package pl.sda.scopy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LocalDateTimeMain {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = new AnnotationConfigApplicationContext(LocalDateTimeConfiguration.class);

        System.out.println("Prototype:");
        context.getBean("prototypeBean", LocalDateTimeNoSingleton.class).showLocalDateTime();
        System.out.println("Singleton:");
        context.getBean("singletonBean", LocalDateTimeSingleton.class).showLocalDateTime();

        Thread.sleep(100);

        System.out.println("Singleton:");
        context.getBean("singletonBean", LocalDateTimeSingleton.class).showLocalDateTime();
        System.out.println("Prototype:");
        context.getBean("prototypeBean", LocalDateTimeNoSingleton.class).showLocalDateTime();

    }
}
