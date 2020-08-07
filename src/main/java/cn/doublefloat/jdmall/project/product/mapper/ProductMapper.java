package cn.doublefloat.jdmall.project.product.mapper;

import cn.doublefloat.jdmall.project.product.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 李广帅
 * @date 2020/8/4 4:15 下午
 */
@Repository
public interface ProductMapper {

    /**
     * 查询商品列表
     *
     * @param product 查询条件
     * @return 商品列表
     */
    public List<Product> queryProductList(Product product);


    /**
     * 查询商品详情
     *
     * @param id 商品编号
     * @return 商品信息
     */
    public Product queryProductInfo(String id);
}
