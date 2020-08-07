package cn.doublefloat.jdmall.project.product.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import cn.doublefloat.jdmall.project.product.domain.*;

import java.util.List;

/**
 * @author 李广帅
 * @date 2020/8/4 4:49 下午
 */
@SpringBootTest
public class TestProductMapper {

    @Autowired
    private ProductMapper productMapper;

    @Test
    public void testQueryGoodsList() {
        Product product = new Product();
        /*goods.setGoodsName("手机");*/
        product.setProductSummary("电脑");
        List<Product> productList = productMapper.queryProductList(product);
        productList.forEach(System.out::println);
    }

    @Test
    public void testQueryGoodsInfo() {
        String id = "9852457e2cb8492b86e1882c05ba4c9b";
        Product product = productMapper.queryProductInfo(id);
        System.out.println(product);
    }

}
