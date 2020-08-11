package cn.doublefloat.jdmall.project.test.controller;

import cn.doublefloat.jdmall.common.exception.BaseException;
import cn.doublefloat.jdmall.framework.web.domain.AjaxResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 李广帅
 * @date 2020/8/11 10:55 下午
 */
@RestController
public class TestExceptionController {

    @GetMapping("/exception")
    public AjaxResult exceptionTest() {
        if (true) {
            throw new BaseException("100", "100", null, null);
        }
        return null;
    }
}
