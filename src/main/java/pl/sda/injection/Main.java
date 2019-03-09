package pl.sda.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(UserConfiguration.class);
        context.getBean("userService", UserService.class).getUserController();
        context.getBean("userService", UserService.class).getUserField();
        context.getBean("userService", UserService.class).getUserSetter();

    }
}
