package cn.doublefloat.jdmall.project.address.service.impl;

import cn.doublefloat.jdmall.common.utils.ServletUtils;
import cn.doublefloat.jdmall.common.utils.StringUtils;
import cn.doublefloat.jdmall.framework.security.service.TokenService;
import cn.doublefloat.jdmall.project.address.domain.Address;
import cn.doublefloat.jdmall.project.address.mapper.AddressMapper;
import cn.doublefloat.jdmall.project.address.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author 江瀚文
 * @date 2020/8/12 1:56 下午
 */
@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressMapper addressMapper;

    @Autowired
    private TokenService tokenService;

    @Override
    public Integer addAddress(Address address) {
        address.setUserId(tokenService.getLoginUser(ServletUtils.getRequest()).getUser().getUserId());
        address.setCreateTime(new Date());
        if (StringUtils.isNull(address.getDefaultAddress())) {
            address.setDefaultAddress(false);
        }
        return addressMapper.add(address);
    }

    @Override
    public Integer delAddress(Address address) {
        address.setUserId(tokenService.getLoginUser(ServletUtils.getRequest()).getUser().getUserId());
        address.setCreateTime(new Date());
        if (StringUtils.isNull(address.getDefaultAddress())) {
            address.setDefaultAddress(false);
        }
        return addressMapper.del(address);
    }

    @Override
    public Integer modifyAddress(Address address){
        address.setUserId(tokenService.getLoginUser(ServletUtils.getRequest()).getUser().getUserId());
        address.setCreateTime(new Date());
        if (StringUtils.isNull(address.getDefaultAddress())) {
            address.setDefaultAddress(false);
        }
        return addressMapper.modify(address);
    }

    @Override
    public Address select_oneAddress(Address address){
        address.setUserId(tokenService.getLoginUser(ServletUtils.getRequest()).getUser().getUserId());
        address.setCreateTime(new Date());
        if (StringUtils.isNull(address.getDefaultAddress())) {
            address.setDefaultAddress(false);
        }
        return addressMapper.select_one(address);
    }

    @Override
    public List<Address> select_allAddress(Address address){
        address.setUserId(tokenService.getLoginUser(ServletUtils.getRequest()).getUser().getUserId());
        return addressMapper.select_all(address);
    }
}
