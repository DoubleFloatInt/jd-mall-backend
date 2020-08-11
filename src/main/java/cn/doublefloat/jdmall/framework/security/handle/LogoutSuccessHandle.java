package cn.doublefloat.jdmall.framework.security.handle;

import cn.doublefloat.jdmall.common.constants.Constants;
import cn.doublefloat.jdmall.common.utils.StringUtils;
import cn.doublefloat.jdmall.framework.redis.RedisCacheService;
import cn.doublefloat.jdmall.framework.security.domain.LoginUser;
import cn.doublefloat.jdmall.framework.security.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 李广帅
 * @date 2020/8/11 4:08 下午
 */
@Component
public class LogoutSuccessHandle implements LogoutSuccessHandler {

    @Autowired
    private RedisCacheService redisCacheService;

    @Autowired
    private TokenService tokenService;

    @Override
    public void onLogoutSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        LoginUser loginUser = tokenService.getLoginUser(httpServletRequest);
        if (StringUtils.isNotNull(loginUser)) {
            String key = Constants.LOGIN_TOKEN_KEY + loginUser.getToken();
            redisCacheService.deleteObject(key);
        }
    }
}
