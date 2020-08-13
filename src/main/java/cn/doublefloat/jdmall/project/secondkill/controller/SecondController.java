package cn.doublefloat.jdmall.project.secondkill.controller;

import cn.doublefloat.jdmall.framework.web.controller.BaseController;
import cn.doublefloat.jdmall.framework.web.domain.AjaxResult;
import cn.doublefloat.jdmall.framework.web.page.TableDataResult;
import cn.doublefloat.jdmall.project.secondkill.domain.SecondKill;
import cn.doublefloat.jdmall.project.secondkill.service.SecondService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 牛生辉
 * @version 1.0
 * @date 2020/8/12 17:27
 * @other
 */
//@RequestMapping("/miaosha")
@RestController
@RequestMapping("/miaosha")
public class SecondController extends BaseController {
    @Autowired
    private SecondService secondService;

    @GetMapping("/list")
    public TableDataResult list(SecondKill secondKill){
        startPage();
        List<SecondKill> secondKillList = secondService.querySecondKillList(secondKill);
        return getTableData(secondKillList);
    }
    @GetMapping("/info/{id}")
    public AjaxResult secondkillInfo(@PathVariable String id){
//        SecondKill secondKill = secondService.querySecondKillInfo(id);
//        return AjaxResult.success(secondKill);
        return null;
    }

}
