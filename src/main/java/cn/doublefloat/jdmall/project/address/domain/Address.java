package cn.doublefloat.jdmall.project.address.domain;

import cn.doublefloat.jdmall.framework.web.domain.BaseEntity;

/**
 * @author 江瀚文
 * @date 2020/8/12 1:44 下午
 */
public class Address extends BaseEntity {

    /**
     * 地址编号
     */
    private Long addressId;

    /**
     * 用户编号
     */
    private Long userId;

    /**
     * 收货人姓名
     */
    private String realName;

    /**
     * 手机号
     */
    private String phonenum;

    /**
     * 省份
     */
    private String province;

    /**
     * 城市
     */
    private String city;

    /**
     * 区县
     */
    private String area;

    /**
     * 街道详细地址
     */
    private String street;

    /**
     * 邮编
     */
    private String zip;

    /**
     * 是否是默认地址
     */
    private Boolean isDefaultAddress;

    public Address() {
    }

    public Address(Long addressId, Long userId, String realName, String phonenum, String province, String city, String area, String street, String zip, Boolean isDefaultAddress) {
        this.addressId = addressId;
        this.userId = userId;
        this.realName = realName;
        this.phonenum = phonenum;
        this.province = province;
        this.city = city;
        this.area = area;
        this.street = street;
        this.zip = zip;
        this.isDefaultAddress = isDefaultAddress;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public Boolean getDefaultAddress() {
        return isDefaultAddress;
    }

    public void setDefaultAddress(Boolean defaultAddress) {
        isDefaultAddress = defaultAddress;
    }
}
