package cn.doublefloat.jdmall.project.user.controller;

import cn.doublefloat.jdmall.common.constants.Constants;
import cn.doublefloat.jdmall.framework.security.service.LoginService;
import cn.doublefloat.jdmall.framework.web.domain.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 李广帅
 * @date 2020/8/11 3:08 下午
 */
@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public AjaxResult login(String username, String password, String code, String uuid) {
        String token = loginService.login(username, password, code, uuid);
        AjaxResult res = AjaxResult.success();
        res.put(Constants.TOKEN, token);
        return res;
    }
}
