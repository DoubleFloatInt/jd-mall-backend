package cn.doublefloat.jdmall.common.exception.user;

/**
 * @author 李广帅
 * @date 2020/8/11 7:47 下午
 */
public class CaptchaException extends UserException {
    private static final long serialVersionUID = 1L;

    public CaptchaException() {
        super("user.captcha.error", null);
    }
}
