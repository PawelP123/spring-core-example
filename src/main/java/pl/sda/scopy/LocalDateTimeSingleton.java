package pl.sda.scopy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class LocalDateTimeSingleton {

    private LocalDateTime localDateTime;



    @Autowired
    public LocalDateTimeSingleton(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;

    }

    void showLocalDateTime() {
        System.out.println(localDateTime);

    }
}
