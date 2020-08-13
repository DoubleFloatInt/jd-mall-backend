package cn.doublefloat.jdmall.second.mapper;

import cn.doublefloat.jdmall.project.secondkill.domain.SecondKill;
import cn.doublefloat.jdmall.project.secondkill.mapper.SecondMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author 牛生辉
 * @version 1.0
 * @date 2020/8/13 17:06
 * @other
 */
@SpringBootTest
public class TestSecondKillMapper {

    @Autowired
    private SecondMapper secondMapper;

    @Test
    public void testQueryGoodsList(){
        SecondKill secondKill = new SecondKill();
        List<SecondKill> secondKillList = secondMapper.querySecondKillList(secondKill);
        secondKillList.forEach(System.out::println);
    }
}
