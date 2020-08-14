package cn.doublefloat.jdmall.project.order.service;

import cn.doublefloat.jdmall.project.order.domain.Order;

/**
 * @author 李广帅
 * @date 2020/8/13 11:06 下午
 */
public interface OrderService {

    /**
     * 添加订单
     *
     * @param order 订单信息
     * @return 结果
     */
    public Integer addOrder(Order order);
}
