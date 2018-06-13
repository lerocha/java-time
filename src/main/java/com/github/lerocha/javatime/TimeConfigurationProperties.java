package com.github.lerocha.javatime;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.time.*;

@Data
@Configuration
@ConfigurationProperties(prefix = "time")
public class TimeConfigurationProperties {
    private LocalDate localDate;
    private LocalTime localTime;
    private LocalDateTime localDateTime;
    private ZonedDateTime zonedDateTime;
    private ZoneId zoneId;
    private ZoneOffset zoneOffset;
}
