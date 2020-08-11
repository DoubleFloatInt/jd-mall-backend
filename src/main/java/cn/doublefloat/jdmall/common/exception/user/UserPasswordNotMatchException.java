package cn.doublefloat.jdmall.common.exception.user;

/**
 * @author 李广帅
 * @date 2020/8/11 7:49 下午
 */
public class UserPasswordNotMatchException extends UserException {
    private static final long serialVersionUID = 1L;

    public UserPasswordNotMatchException()
    {
        super("user.password.not.match", null);
    }
}
