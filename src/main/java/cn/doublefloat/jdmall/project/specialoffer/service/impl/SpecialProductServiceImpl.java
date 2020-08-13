package cn.doublefloat.jdmall.project.specialoffer.service.impl;

import cn.doublefloat.jdmall.project.product.domain.Product;
import cn.doublefloat.jdmall.project.product.mapper.ProductMapper;
import cn.doublefloat.jdmall.project.specialoffer.domain.SpecialOffer;
import cn.doublefloat.jdmall.project.specialoffer.mapper.SpecialOfferMapper;
import cn.doublefloat.jdmall.project.specialoffer.mapper.SpecialOfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* 牛生辉 2020/8/13 21:21
 * \* Description:
 * \
 */
@Service
public class SpecialProductServiceImpl implements SpecialOfferService {
    @Autowired
    private SpecialOfferMapper specialOfferMapper;

    @Override
    public List<SpecialOffer> querySpecialProductList(SpecialOffer product) {
        return specialOfferMapper.querySpecialProductList(product);
    }

    @Override
    public List<SpecialOffer> query9_9ProductList(SpecialOffer product) {
        return specialOfferMapper.query9_9ProductList(product);
    }
}