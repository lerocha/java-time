package com.github.lerocha.javatime.converter;

import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.time.LocalDateTime;

@Component
@ConfigurationPropertiesBinding
public class StringToLocalDateTimeConverter implements Converter<String, LocalDateTime> {
    @Override
    public LocalDateTime convert(String value) {
        return StringUtils.isEmpty(value) ? null : LocalDateTime.parse(value);
    }
}
