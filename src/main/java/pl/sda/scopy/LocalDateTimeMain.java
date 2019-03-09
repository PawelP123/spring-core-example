package pl.sda.scopy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LocalDateTimeMain {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = new AnnotationConfigApplicationContext(LocalDateTimeConfiguration.class);

        context.getBean("localDateTimeNoSingleton",LocalDateTimeNoSingleton.class).showLocalDateTime();
        context.getBean("localDateTimeSingleton",LocalDateTimeSingleton.class).showLocalDateTime();

        Thread.sleep(100);

        context.getBean("localDateTimeSingleton",LocalDateTimeSingleton.class).showLocalDateTime();
        context.getBean("localDateTimeNoSingleton",LocalDateTimeNoSingleton.class).showLocalDateTime();

    }
}
