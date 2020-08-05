package com.demo.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author xiapp
 * @version 1.0
 * @date 2020/8/5 16:02
 */
class DateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String text) {
        if (StringUtils.hasText(text)) {
            try {
                if (!text.contains(":") && text.length() == 10) {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    return dateFormat.parse(text);
                } else if (text.indexOf(":") > 0 && text.length() == 19) {
                    SimpleDateFormat datetimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    return datetimeFormat.parse(text);
                } else {
                    throw new IllegalArgumentException("Could not parse date, date format is error ");
                }
            } catch (ParseException ex) {
                throw new IllegalArgumentException("Could not parse date: " + ex.getMessage(), ex);
            }
        } else {
            return null;
        }
    }
}
