package cn.doublefloat.jdmall.project.order.mapper;

import cn.doublefloat.jdmall.project.order.domain.Order;
import cn.doublefloat.jdmall.project.order.domain.po.OrderPO;
import org.springframework.stereotype.Repository;

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
}
