package cn.doublefloat.jdmall.framework.security.service;

import cn.doublefloat.jdmall.common.constants.Constants;
import cn.doublefloat.jdmall.common.exception.user.CaptchaException;
import cn.doublefloat.jdmall.common.exception.user.CaptchaExpireException;
import cn.doublefloat.jdmall.common.utils.StringUtils;
import cn.doublefloat.jdmall.framework.redis.RedisCacheService;
import cn.doublefloat.jdmall.framework.security.domain.LoginUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

/**
 * @author 李广帅
 * @date 2020/8/11 3:10 下午
 */
@Service
public class LoginService {

    @Autowired
    private RedisCacheService redisCacheService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenService tokenService;

    public String login(String username, String password, String code, String uuid) {
        String verifyKey = Constants.CAPTCHA_CODE_KEY + uuid;

        String captcha = redisCacheService.getCacheObject(verifyKey);
        redisCacheService.deleteObject(verifyKey);

        if (StringUtils.isNull(captcha)) {
            throw new CaptchaExpireException();
        }

        if (!code.equals(captcha)) {
            throw new CaptchaException();
        }

        Authentication authentication = null;
        try {
            authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        } catch (Exception e) {
            e.printStackTrace();
        }
        LoginUser loginUser = (LoginUser) authentication.getPrincipal();
        return tokenService.createToken(loginUser);
    }
}
