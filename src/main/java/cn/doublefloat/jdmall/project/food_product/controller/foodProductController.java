package cn.doublefloat.jdmall.project.food_product.controller;

import cn.doublefloat.jdmall.framework.web.controller.BaseController;
import cn.doublefloat.jdmall.framework.web.domain.AjaxResult;
import cn.doublefloat.jdmall.framework.web.page.TableDataResult;
import cn.doublefloat.jdmall.project.food_product.domain.foodProduct;
import cn.doublefloat.jdmall.project.food_product.service.foodProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* 赵潭 2020/8/12 23:43
 * \* Description:
 * \
 */
@RestController
@RequestMapping("/foodProduct")
public class foodProductController extends BaseController {

    @Autowired
    private foodProductService foodproductService;

    @GetMapping("/list")
    public TableDataResult list(foodProduct product) {
        startPage();
        List<foodProduct> foodproductList = foodproductService.queryProductList(product);
        return getTableData(foodproductList);
    }
    @GetMapping("/listBycateId/{cateId}")
    public TableDataResult listBycateId(@PathVariable String cateId) {
        startPage();
        List<foodProduct> foodproductList = foodproductService.queryProductListBycateId(cateId);
        return getTableData(foodproductList);
    }

    @GetMapping("/info/{id}")
    public AjaxResult productInfo(@PathVariable String id) {
        foodProduct product = foodproductService.queryProductInfo(id);
        return AjaxResult.success(product);
    }
}