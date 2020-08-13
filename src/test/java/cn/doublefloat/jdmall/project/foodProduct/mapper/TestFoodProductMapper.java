package cn.doublefloat.jdmall.project.foodProduct.mapper;

import cn.doublefloat.jdmall.project.food_product.domain.foodProduct;
import cn.doublefloat.jdmall.project.food_product.mapper.foodProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * \* Created with IntelliJ IDEA.
 * \* 赵潭 2020/8/13 17:08
 * \* Description:
 * \
 */
@SpringBootTest
public class TestFoodProductMapper {
    @Autowired
    private foodProductMapper foodproductmapper;

    @Test
    public  void testFoodProduct(){
        String cateId="dbeed826550f4d3d82ea9bb27478c381";
        List<foodProduct> ls=foodproductmapper.queryProductListBycateId(cateId);
        ls.forEach(System.out::println);
    }
}