package cn.doublefloat.jdmall.project.secondkill.mapper;

import cn.doublefloat.jdmall.project.secondkill.domain.SecondKill;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 牛生辉
 * @version 1.0
 * @date 2020/8/12 17:29
 * @other
 */
@Repository
public interface SecondMapper {
    /**
     * 查询商品列表
     *
     * @param secondKill 查询条件
     * @return 商品信息
     */
    public List<SecondKill> querySecondKillList(SecondKill secondKill);

    /**
     * 查询商品信息
     *
     * @param id 商品编号
     * @return 商品信息
     */
//    public SecondKill querySecondKillInfo(String id);
}
