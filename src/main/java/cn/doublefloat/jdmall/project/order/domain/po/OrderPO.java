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
     * 商品图片
     */
    private String productImage;

    /**
     * 商品数量
     */
    private Integer quantity;

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

    public OrderPO(Long id, Long orderId, String productId, String productName, Double productPrice, String productImage, Integer quantity, Double subTotal, String remark) {
        this.id = id;
        this.orderId = orderId;
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productImage = productImage;
        this.quantity = quantity;
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
                ", productImage='" + productImage + '\'' +
                ", quantity=" + quantity +
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

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
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
