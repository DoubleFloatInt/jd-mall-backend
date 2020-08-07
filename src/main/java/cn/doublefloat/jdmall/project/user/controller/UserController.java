package cn.doublefloat.jdmall.project.user.controller;

import cn.doublefloat.jdmall.framework.web.controller.BaseController;
import cn.doublefloat.jdmall.framework.web.domain.AjaxResult;
import cn.doublefloat.jdmall.project.user.domain.User;
import cn.doublefloat.jdmall.project.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 李广帅
 * @date 2020/8/5 10:53 上午
 */
@RestController
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public AjaxResult add(User user) {
        return null;
    }
}
