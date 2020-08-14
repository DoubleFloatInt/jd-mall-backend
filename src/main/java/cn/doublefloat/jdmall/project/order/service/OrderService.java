package cn.doublefloat.jdmall.project.order.service;

import cn.doublefloat.jdmall.project.order.domain.Order;

import java.util.List;

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

    /**
     * 订单列表
     *
     * @param order 查询条件
     * @return 订单列表
     */
    public List<Order> orderList(Order order);

    /**
     * 删除订单信息
     *
     * @param orderId 订单编号
     * @return 结果
     */
    public Integer deleteOrder(Long orderId);
}
