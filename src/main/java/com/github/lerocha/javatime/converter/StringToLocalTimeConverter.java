package com.github.lerocha.javatime.converter;

import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.time.LocalTime;

@Component
@ConfigurationPropertiesBinding
public class StringToLocalTimeConverter implements Converter<String, LocalTime> {
    @Override
    public LocalTime convert(String value) {
        return StringUtils.isEmpty(value) ? null : LocalTime.parse(value);
    }
}
