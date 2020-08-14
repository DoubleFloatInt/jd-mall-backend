package cn.doublefloat.jdmall.project.order.domain;

import cn.doublefloat.jdmall.framework.web.domain.BaseEntity;
import cn.doublefloat.jdmall.project.order.domain.po.OrderPO;

import java.util.List;

/**
 * @author 李广帅
 * @date 2020/8/13 10:40 下午
 */
public class Order extends BaseEntity {

    /**
     * 自动编号
     */
    private Long orderId;

    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 用户编号
     */
    private Long userId;

    /**
     * 订单状态
     */
    private String status;

    /**
     * 商品数量
     */
    private Integer productCount;

    /**
     * 商品总价
     */
    private Double productAmount;

    /**
     * 商品实际付款金额
     */
    private Double orderAmountTotal;

    /**
     * 收货地址编号
     */
    private Long addressId;

    /**
     * 商品列表
     */
    private List<OrderPO> productList;

    public Order() {
    }

    public Order(Long orderId, String orderNo, Long userId, String status, Integer productCount, Double productAmount, Double orderAmountTotal, Long addressId, List<OrderPO> productList) {
        this.orderId = orderId;
        this.orderNo = orderNo;
        this.userId = userId;
        this.status = status;
        this.productCount = productCount;
        this.productAmount = productAmount;
        this.orderAmountTotal = orderAmountTotal;
        this.addressId = addressId;
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderNo='" + orderNo + '\'' +
                ", userId=" + userId +
                ", status='" + status + '\'' +
                ", productCount=" + productCount +
                ", productAmount=" + productAmount +
                ", orderAmountTotal=" + orderAmountTotal +
                ", addressId=" + addressId +
                ", productList=" + productList +
                '}';
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    public Double getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(Double productAmount) {
        this.productAmount = productAmount;
    }

    public Double getOrderAmountTotal() {
        return orderAmountTotal;
    }

    public void setOrderAmountTotal(Double orderAmountTotal) {
        this.orderAmountTotal = orderAmountTotal;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public List<OrderPO> getProductList() {
        return productList;
    }

    public void setProductList(List<OrderPO> productList) {
        this.productList = productList;
    }
}
