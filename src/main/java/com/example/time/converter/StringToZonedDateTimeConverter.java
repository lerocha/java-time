package com.example.time.converter;

import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.time.ZonedDateTime;

@Component
@ConfigurationPropertiesBinding
public class StringToZonedDateTimeConverter implements Converter<String, ZonedDateTime> {
    @Override
    public ZonedDateTime convert(String value) {
        return StringUtils.isEmpty(value) ? null : ZonedDateTime.parse(value);
    }
}
