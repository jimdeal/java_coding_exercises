package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exercise004 {
    private LocalDateTime ldt;

    public Exercise004(LocalDate date) {
        ldt = date.atStartOfDay();
    }

    public Exercise004(LocalDateTime dateTime) {
        ldt = dateTime;
    }

    public LocalDateTime getDateTime() {

        ldt = ldt.plusSeconds(1000000000);
        return ldt;
    }
}
