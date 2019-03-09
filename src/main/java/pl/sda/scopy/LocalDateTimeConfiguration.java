package pl.sda.scopy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.time.LocalDateTime;


@Configuration
@ComponentScan("pl.sda.scopy")
public class LocalDateTimeConfiguration {


    @Bean
    @Scope("prototype")
    LocalDateTime localDateTime() {
        return LocalDateTime.now();
    }

}
