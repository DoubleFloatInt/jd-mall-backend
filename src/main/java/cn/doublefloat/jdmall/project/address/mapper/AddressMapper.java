package cn.doublefloat.jdmall.project.address.mapper;

import cn.doublefloat.jdmall.project.address.domain.Address;
import org.springframework.stereotype.Repository;

/**
 * @author 李广帅
 * @date 2020/8/12 1:58 下午
 */
@Repository
public interface AddressMapper {

    /**
     * 添加地址信息
     * @param address 地址信息
     * @return 结果
     */
    public Integer add(Address address);
}
