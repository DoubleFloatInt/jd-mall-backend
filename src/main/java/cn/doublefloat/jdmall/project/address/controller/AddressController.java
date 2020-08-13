package cn.doublefloat.jdmall.project.address.controller;

import cn.doublefloat.jdmall.framework.web.controller.BaseController;
import cn.doublefloat.jdmall.framework.web.domain.AjaxResult;
import cn.doublefloat.jdmall.project.address.domain.Address;
import cn.doublefloat.jdmall.project.address.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 李广帅
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

    @PostMapping("/select_one")
    public AjaxResult select_one(Address address){
        return toAjax(addressService.select_oneAddress(address));
    }

    @PostMapping("/select_all")
    public AjaxResult select_all(Address address){
        return  toAjax(addressService.select_allAddress(address));
    }
}
