package cn.doublefloat.jdmall.project.product.controller;

import cn.doublefloat.jdmall.framework.web.controller.BaseController;
import cn.doublefloat.jdmall.framework.web.domain.AjaxResult;
import cn.doublefloat.jdmall.framework.web.page.TableDataResult;
import cn.doublefloat.jdmall.project.product.domain.Product;
import cn.doublefloat.jdmall.project.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 李广帅
 * @date 2020/8/4 1:37 下午
 */
@RestController
@RequestMapping("/product")
public class ProductController extends BaseController {

    @Autowired
    private ProductService productService;

    @GetMapping("/list")
    public TableDataResult list(Product product) {
        startPage();
        List<Product> productList = productService.queryProductList(product);
        return getTableData(productList);
    }

    @GetMapping("/info/{id}")
    public AjaxResult productInfo(@PathVariable String id) {
        Product product = productService.queryProductInfo(id);
        return AjaxResult.success(product);
    }
}
