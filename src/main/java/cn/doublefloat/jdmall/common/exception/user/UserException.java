package cn.doublefloat.jdmall.common.exception.user;

import cn.doublefloat.jdmall.common.exception.BaseException;

/**
 * @author 李广帅
 * @date 2020/8/11 7:46 下午
 */
public class UserException extends BaseException {

    private static final long serialVersionUID = 1L;

    public UserException(String code, Object[] args) {
        super("user", code, args, null);
    }

}
