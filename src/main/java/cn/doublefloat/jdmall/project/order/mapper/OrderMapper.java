package cn.doublefloat.jdmall.project.order.mapper;

import cn.doublefloat.jdmall.project.order.domain.Order;
import cn.doublefloat.jdmall.project.order.domain.po.OrderPO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 李广帅
 * @date 2020/8/13 10:52 下午
 */
@Repository
public interface OrderMapper {
    /**
     * 添加订单
     *
     * @param order 订单信息
     * @return 结果
     */
    public Integer addOrder(Order order);

    /**
     * 添加订单详情
     *
     * @param orderPO 订单详情
     * @return 结果
     */
    public Integer addOrderDetail(OrderPO orderPO);

    /**
     * 获取订单列表
     *
     * @param order 查询条件
     * @return 结果
     */
    public List<Order> getOrderList(Order order);

    /**
     * 查询订单详情
     *
     * @param orderId 订单编号
     * @return 订单
     */
    public List<OrderPO> getOrderDetailList(Long orderId);

    /**
     * 删除订单
     *
     * @param orderId 订单ID
     * @return 结果
     */
    public Integer deleteOrder(Long orderId);
}
