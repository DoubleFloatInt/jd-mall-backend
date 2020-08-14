package cn.doublefloat.jdmall.project.order.controller;

import cn.doublefloat.jdmall.framework.web.domain.AjaxResult;
import cn.doublefloat.jdmall.framework.web.page.TableDataResult;
import cn.doublefloat.jdmall.project.order.domain.Order;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 李广帅
 * @date 2020/8/13 10:52 下午
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    public AjaxResult addOrder(Order order) {
        return null;
    }

    public AjaxResult deleteOrder(Long orderId) {
        return null;
    }

    public TableDataResult orderList(Order order) {
        return null;
    }
}
