package pl.sda.scopy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component("prototypeBean")
@Scope("prototype")
public class LocalDateTimeNoSingleton {

    private LocalDateTime localDate;

    @Autowired
    public LocalDateTimeNoSingleton(LocalDateTime localDate) {
        this.localDate = localDate;
    }

    void showLocalDateTime() {
        System.out.println(localDate);
    }
}
