package cn.doublefloat.jdmall.common.exception;

import cn.doublefloat.jdmall.common.utils.MessageUtils;
import cn.doublefloat.jdmall.common.utils.StringUtils;

/**
 * @author 李广帅
 * @date 2020/8/11 7:35 下午
 */
public class BaseException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private String module;

    private String code;

    private Object[] args;

    private String defaultMessage;

    public BaseException(String module, String code, Object[] args, String defaultMessage)
    {
        this.module = module;
        this.code = code;
        this.args = args;
        this.defaultMessage = defaultMessage;
    }

    public BaseException(String defaultMessage)
    {
        this(null, null, null, defaultMessage);
    }

    @Override
    public String getMessage() {
        String message = null;
        if (StringUtils.isEmpty(code)) {
            message = MessageUtils.message(code, args);
        }

        if (message == null) {
            message = defaultMessage;
        }
        return message;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object[] getArgs() {
        return args;
    }

    public void setArgs(Object[] args) {
        this.args = args;
    }

    public String getDefaultMessage() {
        return defaultMessage;
    }

    public void setDefaultMessage(String defaultMessage) {
        this.defaultMessage = defaultMessage;
    }
}
