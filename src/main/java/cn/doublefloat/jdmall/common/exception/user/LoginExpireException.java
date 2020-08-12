package cn.doublefloat.jdmall.common.exception.user;

/**
 * @author 李广帅
 * @date 2020/8/12 12:20 上午
 */
public class LoginExpireException extends UserException {
    private static final long serialVersionUID = 1L;

    public LoginExpireException() {
        super("user.notfound", null);
    }
}
