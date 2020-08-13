package cn.doublefloat.jdmall.project.food_product.service;

import cn.doublefloat.jdmall.project.food_product.domain.foodProduct;

import java.util.List;

public interface foodProductService{

    /**
     * 查询商品列表
     *
     * @param foodproduct 查询条件
     * @return 商品信息
     */
    public List<foodProduct> queryProductList(foodProduct foodproduct);

    /**
     * 用商品类别查询商品列表
     *
     * @param cateId 商品类别ID
     * @return 商品列表
     */
    public List<foodProduct> queryProductListBycateId(String cateId);

    /**
     * 查询商品信息
     *
     * @param id 商品编号
     * @return 商品信息
     */
    public foodProduct queryProductInfo(String id);
}
