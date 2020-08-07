package cn.doublefloat.jdmall.project.product.service;

import cn.doublefloat.jdmall.project.product.domain.Product;

import java.util.List;

/**
 * @author 李广帅
 * @date 2020/8/4 4:12 下午
 */
public interface ProductService {

    /**
     * 查询商品列表
     *
     * @param product 查询条件
     * @return 商品信息
     */
    public List<Product> queryProductList(Product product);

    /**
     * 查询商品信息
     *
     * @param id 商品编号
     * @return 商品信息
     */
    public Product queryProductInfo(String id);
}
