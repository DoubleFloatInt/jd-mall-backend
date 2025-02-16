package cn.doublefloat.jdmall.project.address.mapper;

import cn.doublefloat.jdmall.project.address.domain.Address;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 江瀚文
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

    /**
     * 删除地址信息
     * @param address  地址信息
     * @return  结果
     */
    public Integer del(Address address);

    /**
     * 修改地址信息
     * @param address
     * @return
     */
    public  Integer modify(Address address);

    /**
     * 查找一个地址信息
     * @param addressId
     * @return
     */
    public  Address select_one(Long addressId);

    /**
     * 查找所有地址信息
     * @param address
     * @return
     */
    public List<Address> select_all(Address address);
}
