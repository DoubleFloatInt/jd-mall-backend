package cn.doublefloat.jdmall.common.utils;

import cn.doublefloat.jdmall.common.utils.spring.SpringUtils;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;

/**
 * @author 李广帅
 * @date 2020/8/11 7:39 下午
 */
public class MessageUtils {

    public static String message(String code, Object... args) {
        MessageSource messageSource = SpringUtils.getBean(MessageSource.class);
        return messageSource.getMessage(code, args, LocaleContextHolder.getLocale());
    }
}
