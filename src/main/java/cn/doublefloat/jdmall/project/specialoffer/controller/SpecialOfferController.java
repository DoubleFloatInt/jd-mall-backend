package cn.doublefloat.jdmall.project.specialoffer.controller;

import cn.doublefloat.jdmall.framework.web.page.TableDataResult;
import cn.doublefloat.jdmall.project.specialoffer.domain.SpecialOffer;
import cn.doublefloat.jdmall.framework.web.controller.BaseController;
import cn.doublefloat.jdmall.project.specialoffer.service.SpecialOfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;


/**
 * @author 牛生辉
 * @version 1.0
 * @date 2020/8/12 17:27
 * @other
 */
@RestController
@RequestMapping("/specialoffer")
public class SpecialOfferController extends BaseController{
    @Autowired
    private SpecialOfferService productService;

    @GetMapping("/specialofferlist")
    public TableDataResult specialofferlist(SpecialOffer product) {
        startPage();
        List<SpecialOffer> productList = productService.querySpecialProductList(product);
        return getTableData(productList);
    }

    @GetMapping("/specialoffer9_9list")
    public TableDataResult specialoffer9_9list(SpecialOffer product) {
        startPage();
        List<SpecialOffer> special9_9list = productService.query9_9ProductList(product);
        return getTableData(special9_9list);
    }
}