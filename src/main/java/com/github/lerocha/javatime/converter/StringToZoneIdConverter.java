package com.github.lerocha.javatime.converter;

import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.time.ZoneId;

@Component
@ConfigurationPropertiesBinding
public class StringToZoneIdConverter implements Converter<String, ZoneId> {
    @Override
    public ZoneId convert(String value) {
        return StringUtils.isEmpty(value) ? null : ZoneId.of(value);
    }
}
