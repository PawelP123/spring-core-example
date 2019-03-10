package pl.sda.scopy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component("singletonBean")
public class LocalDateTimeSingleton {

    private final LocalDateTime localDateTime;


    @Autowired
    public LocalDateTimeSingleton(final LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;

    }

    void showLocalDateTime() {
        System.out.println(localDateTime);

    }
}
