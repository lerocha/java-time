package com.example.time;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;

@Data
@Configuration
@ConfigurationProperties(prefix = "time")
public class TimeConfigurationProperties {
    private LocalDate localDate;
    private LocalTime localTime;
    private LocalDateTime localDateTime;
    private ZonedDateTime zonedDateTime;
}
