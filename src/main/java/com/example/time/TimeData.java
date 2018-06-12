package com.example.time;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.*;

@Data
@AllArgsConstructor
public class TimeData {
    private LocalDate localDate;
    private LocalTime localTime;
    private LocalDateTime localDateTime;
    private ZonedDateTime zonedDateTime;
    private ZoneId zoneId;
    private ZoneOffset zoneOffset;
}
