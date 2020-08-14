package cn.doublefloat.jdmall.project.order.service.impl;

import cn.doublefloat.jdmall.common.utils.IdUtils;
import cn.doublefloat.jdmall.common.utils.ServletUtils;
import cn.doublefloat.jdmall.framework.security.service.TokenService;
import cn.doublefloat.jdmall.project.order.domain.Order;
import cn.doublefloat.jdmall.project.order.domain.po.OrderPO;
import cn.doublefloat.jdmall.project.order.mapper.OrderMapper;
import cn.doublefloat.jdmall.project.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author 李广帅
 * @date 2020/8/14 10:52 上午
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private TokenService tokenService;

    @Override
    public Integer addOrder(Order order) {
        Long userId = tokenService.getLoginUser(ServletUtils.getRequest()).getUser().getUserId();
        order.setUserId(userId);
        Integer result = 0;
        String orderNo = IdUtils.orderNo();
        order.setOrderNo(orderNo);
        order.setCreateTime(new Date());
        orderMapper.addOrder(order);
        for (OrderPO orderPO : order.getProductList()) {
            orderPO.setOrderId(order.getOrderId());
            orderPO.setSubTotal(orderPO.getProductPrice() * orderPO.getQuantity());
            result += orderMapper.addOrderDetail(orderPO);
        }
        return result;
    }
}
