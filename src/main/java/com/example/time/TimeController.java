package com.example.time;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.*;

@RestController
@RequiredArgsConstructor
public class TimeController {

    private final TimeConfigurationProperties timeConfigurationProperties;

    @GetMapping(path = "time")
    public ResponseEntity<TimeData> getTimeData() {
        TimeData timeData = new TimeData(
                LocalDate.now(),
                LocalTime.now(),
                LocalDateTime.now(),
                ZonedDateTime.now(),
                ZonedDateTime.now().getZone(),
                ZonedDateTime.now().getOffset());
        return ResponseEntity.ok(timeData);
    }

    @GetMapping(path = "time/config")
    public ResponseEntity<TimeData> getTimeDataFromConfig() {
        TimeData timeData = new TimeData(
                timeConfigurationProperties.getLocalDate(),
                timeConfigurationProperties.getLocalTime(),
                timeConfigurationProperties.getLocalDateTime(),
                timeConfigurationProperties.getZonedDateTime(),
                timeConfigurationProperties.getZoneId(),
                timeConfigurationProperties.getZoneOffset()
        );
        return ResponseEntity.ok(timeData);
    }
}