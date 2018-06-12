package com.example.time;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
@RequiredArgsConstructor
public class TimeController {

    @GetMapping(path = "time")
    public ResponseEntity<TimeData> getTime() {
        TimeData timeData = new TimeData(LocalDate.now(), LocalDateTime.now());
        return ResponseEntity.ok(timeData);
    }
}