package cn.doublefloat.jdmall.project.specialoffer.mapper;

import cn.doublefloat.jdmall.project.product.domain.Product;
import cn.doublefloat.jdmall.project.specialoffer.domain.SpecialOffer;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 牛生辉
 * @date 2020/8/13 4:15 下午
 */
@Repository
public interface SpecialOfferMapper {

    /**
     * 查询所有特价商品列表
     *
     * @param product 查询条件
     * @return 商品列表
     */
    public List<SpecialOffer> querySpecialProductList(SpecialOffer product);


    /**
     * 查询所有低于9.9元商品列表
     *
     * @param id 商品编号
     * @return 商品信息
     */
    public List<SpecialOffer> query9_9ProductList(SpecialOffer product);
}
