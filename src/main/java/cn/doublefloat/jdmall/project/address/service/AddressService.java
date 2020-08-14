package cn.doublefloat.jdmall.project.address.service;

import cn.doublefloat.jdmall.project.address.domain.Address;

import java.util.List;

/**
 * @author 江瀚文
 * @date 2020/8/12 1:54 下午
 */
public interface AddressService {

    /**
     * 添加地址信息
     *
     * @param address 地址信息
     * @return 结果
     */
    public Integer addAddress(Address address);

    /**
     * 删除地址信息
     * @param address  地址信息
     * @return  结果
     */
    public Integer delAddress(Address address);

    /**
     * 修改地址信息
     * @param address
     * @return
     */
    public Integer modifyAddress(Address address);

    /**
     * 查找一个地址信息
     * @param address
     * @return
     */
    public  Address select_oneAddress(Address address);

    /**
     * 查找所有地址信息
     * @param address
     * @return
     */
    public List<Address> select_allAddress(Address address);
}
