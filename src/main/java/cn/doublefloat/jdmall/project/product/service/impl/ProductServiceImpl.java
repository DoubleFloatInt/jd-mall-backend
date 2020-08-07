package cn.doublefloat.jdmall.project.product.service.impl;

import cn.doublefloat.jdmall.project.product.domain.Product;
import cn.doublefloat.jdmall.project.product.mapper.ProductMapper;
import cn.doublefloat.jdmall.project.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 李广帅
 * @date 2020/8/4 4:15 下午
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> queryProductList(Product product) {
        return productMapper.queryProductList(product);
    }

    @Override
    public Product queryProductInfo(String id) {
        return productMapper.queryProductInfo(id);
    }
}
