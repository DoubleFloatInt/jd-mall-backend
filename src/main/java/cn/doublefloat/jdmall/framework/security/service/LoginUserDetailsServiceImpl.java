package cn.doublefloat.jdmall.framework.security.service;

import cn.doublefloat.jdmall.common.constants.UserConstants;
import cn.doublefloat.jdmall.common.exception.BaseException;
import cn.doublefloat.jdmall.common.utils.StringUtils;
import cn.doublefloat.jdmall.framework.security.domain.LoginUser;
import cn.doublefloat.jdmall.project.user.domain.User;
import cn.doublefloat.jdmall.project.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author 李广帅
 * @date 2020/8/11 3:23 下午
 */
@Service
public class LoginUserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.queryUserByUsername(username);
        if (StringUtils.isNull(user)) {
            throw new UsernameNotFoundException("登录用户：" + username + " 不存在");
        }
        else if (UserConstants.USER_DELETED.equals(user.getStatus())) {
            throw new BaseException("对不起，您的账号：" + username + " 已被删除");
        }
        else if (UserConstants.USER_DISABLE.equals(user.getStatus())) {
            throw new BaseException("对不起，您的账号：" + username + " 已停用");
        }
        return createUserDetails(user);
    }

    public UserDetails createUserDetails(User user) {
        return new LoginUser(user);
    }
}
