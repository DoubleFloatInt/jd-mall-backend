package cn.doublefloat.jdmall.project.food_product.service.Impl;


import cn.doublefloat.jdmall.project.food_product.domain.foodProduct;
import cn.doublefloat.jdmall.project.food_product.mapper.foodProductMapper;
import cn.doublefloat.jdmall.project.food_product.service.foodProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* 赵潭 2020/8/12 23:29
 * \* Description: DAO
 * \
 */
@Service
public class foodProductServiceImpl implements foodProductService {

    @Autowired
    private foodProductMapper foodProductMapper;

    @Override
    public List<foodProduct> queryProductList(foodProduct foodproduct) {
        return foodProductMapper.queryProductList(foodproduct);
    }

    @Override
    public List<foodProduct> queryProductListBycateId(String cateId) {
        return foodProductMapper.queryProductListBycateId(cateId);
    }

    @Override
    public foodProduct queryProductInfo(String id) {
        return foodProductMapper.queryProductInfo(id);
    }
}