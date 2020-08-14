package cn.doublefloat.jdmall.project.order.controller;

import cn.doublefloat.jdmall.framework.web.controller.BaseController;
import cn.doublefloat.jdmall.framework.web.domain.AjaxResult;
import cn.doublefloat.jdmall.framework.web.page.TableDataResult;
import cn.doublefloat.jdmall.project.order.domain.Order;
import cn.doublefloat.jdmall.project.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 李广帅
 * @date 2020/8/13 10:52 下午
 */
@RestController
@RequestMapping("/order")
public class OrderController extends BaseController {

    @Autowired
    private OrderService orderService;

    /**
     * 添加订单
     * @param order 订单
     * @return 结果
     */
    @PostMapping("/add")
    public AjaxResult addOrder(@RequestBody Order order) {
        System.out.println(order);
        return toAjax(orderService.addOrder(order));
    }

    @DeleteMapping("/delete")
    public AjaxResult deleteOrder(Long orderId) {
        return null;
    }

    /**
     * 获取订单列表
     * @param order 查询条件
     * @return 结果
     */
    @PostMapping("/list")
    public TableDataResult orderList( Order order) {
        return null;
    }
}
