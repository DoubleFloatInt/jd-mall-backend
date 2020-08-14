package cn.doublefloat.jdmall.project.address.controller;

import cn.doublefloat.jdmall.framework.web.controller.BaseController;
import cn.doublefloat.jdmall.framework.web.domain.AjaxResult;
import cn.doublefloat.jdmall.framework.web.page.TableDataResult;
import cn.doublefloat.jdmall.project.address.domain.Address;
import cn.doublefloat.jdmall.project.address.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 江瀚文
 * @date 2020/8/12 1:48 下午
 */
@RestController
@RequestMapping("/address")
public class AddressController extends BaseController {

    @Autowired
    private AddressService addressService;

    @PostMapping("/add")
    public AjaxResult addAddress(Address address) {
        return toAjax(addressService.addAddress(address));
    }

    @PostMapping("/del")
    public AjaxResult delAddress(Address address){
        return  toAjax(addressService.delAddress(address));
    }

    @PostMapping("/modify")
    public AjaxResult modify(Address address){
        return toAjax(addressService.modifyAddress(address));
    }

    @PostMapping("/info/{addressId}")
    public AjaxResult selectOne(@PathVariable Long addressId){
        return AjaxResult.success(addressService.select_oneAddress(addressId));
    }

    @PostMapping("/userAddress")
    public TableDataResult selectAll(Address address){
        return getTableData(addressService.select_allAddress(address));
    }
}
