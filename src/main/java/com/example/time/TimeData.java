package com.example.time;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class TimeData {
    private LocalDate localDate;
    private LocalDateTime localDateTime;
}
