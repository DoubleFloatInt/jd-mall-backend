package cn.doublefloat.jdmall.common.exception.user;

/**
 * @author 李广帅
 * @date 2020/8/11 7:48 下午
 */
public class CaptchaExpireException extends UserException {
    private static final long serialVersionUID = 1L;

    public CaptchaExpireException()
    {
        super("user.captcha.expire", null);
    }
}
