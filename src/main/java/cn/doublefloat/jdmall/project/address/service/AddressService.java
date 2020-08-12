package cn.doublefloat.jdmall.project.address.service;

import cn.doublefloat.jdmall.project.address.domain.Address;
import org.springframework.stereotype.Service;

/**
 * @author 李广帅
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
}
