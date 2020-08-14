package cn.doublefloat.jdmall.project.order.domain.po;

/**
 * @author 李广帅
 * @date 2020/8/13 10:46 下午
 */
public class OrderPO {

    /**
     * 自动编号
     */
    private Long id;

    /**
     * 订单编号
     */
    private Long orderId;

    /**
     * 商品编号
     */
    private String productId;

    /**
     * 商品名
     */
    private String productName;

    /**
     * 商品销售价格
     */
    private Double productPrice;

    /**
     * 商品数量
     */
    private Integer number;

    /**
     * 小记金额
     */
    private Double subTotal;

    /**
     * 备注
     */
    private String remark;

    public OrderPO() {
    }

    public OrderPO(Long id, Long orderId, String productId, String productName, Double productPrice, Integer number, Double subTotal, String remark) {
        this.id = id;
        this.orderId = orderId;
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.number = number;
        this.subTotal = subTotal;
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "OrderPO{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", number=" + number +
                ", subTotal=" + subTotal +
                ", remark='" + remark + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
