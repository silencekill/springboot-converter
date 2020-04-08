package org.javaboy.converter.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 实现Converter<转换的数据类型,转换后的数据类型>
 * import org.springframework.core.convert.converter.Converter;
 */
@Component
public class DateConverter implements Converter<String, Date> {
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public Date convert(String s) {
        if(StringUtils.isEmpty(s)){
            return null;
        }
        try {
            return dateFormat.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
