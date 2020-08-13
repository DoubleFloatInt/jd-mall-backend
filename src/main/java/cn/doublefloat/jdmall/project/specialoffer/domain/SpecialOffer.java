package cn.doublefloat.jdmall.project.specialoffer.domain;

import cn.doublefloat.jdmall.framework.web.domain.BaseEntity;

/**
 * @author 牛生辉
 * @date 2020/8/13 4:56 下午
 */
public class SpecialOffer extends BaseEntity {
    /**
     * 商品编号
     */
    private String productId;

    /**
     * 商品名
     */
    private String productName;

    /**
     * 商品介绍
     */
    private String productSummary;

    /**
     * 商品分类编号
     */
    private String cateId;

    /**
     * 商品分类编号
     */
    private String cateName;

    /**
     * 商品定价
     */
    private Double price;

    /**
     * 商品销售价格
     */
    private Double salesPrice;

    /**
     * 商品库存
     */
    private Integer remain;

    /**
     * 商品图片
     */
    private String image;

    /**
     * 商品销量
     */
    private Integer sales;


    public SpecialOffer() {
    }

    public SpecialOffer(String productId, String productName, String productSummary, String cateId, String cateName, Double price, Double salesPrice, Integer remain, String image, Integer sales) {
        this.productId = productId;
        this.productName = productName;
        this.productSummary = productSummary;
        this.cateId = cateId;
        this.cateName = cateName;
        this.price = price;
        this.salesPrice = salesPrice;
        this.remain = remain;
        this.image = image;
        this.sales = sales;
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

    public String getProductSummary() {
        return productSummary;
    }

    public void setProductSummary(String productSummary) {
        this.productSummary = productSummary;
    }

    public String getCateId() {
        return cateId;
    }

    public void setCateId(String cateId) {
        this.cateId = cateId;
    }

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(Double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public Integer getRemain() {
        return remain;
    }

    public void setRemain(Integer remain) {
        this.remain = remain;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", productSummary='" + productSummary + '\'' +
                ", cateId='" + cateId + '\'' +
                ", cateName='" + cateName + '\'' +
                ", price=" + price +
                ", salesPrice=" + salesPrice +
                ", remain=" + remain +
                ", image='" + image + '\'' +
                ", sales=" + sales +
                '}';
    }
}
