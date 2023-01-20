package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exercise004 {
    private LocalDateTime ldt;
    private final int GIGA_SEC = 1000000000;

    public Exercise004(LocalDate date) {
        if(date != null)
        {
            ldt = date.atStartOfDay();
        }
    }

    public Exercise004(LocalDateTime dateTime) {
        if(dateTime != null)
        {
            ldt = dateTime;
        }
    }

    public LocalDateTime getDateTime() {

        ldt = ldt.plusSeconds(GIGA_SEC);
        return ldt;
    }
}
