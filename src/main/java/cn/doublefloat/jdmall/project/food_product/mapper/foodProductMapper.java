package cn.doublefloat.jdmall.project.food_product.mapper;

import cn.doublefloat.jdmall.project.food_product.domain.foodProduct;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* 赵潭 2020/8/12 23:29
 * \* Description: DAO
 * \
 */
@Repository
public interface foodProductMapper {
    /**
     * 查询商品列表
     *
     * @param foodproduct 查询条件
     * @return 商品列表
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
     * 查询商品详情
     *
     * @param id 商品编号
     * @return 商品信息
     */
    public foodProduct queryProductInfo(String id);
}