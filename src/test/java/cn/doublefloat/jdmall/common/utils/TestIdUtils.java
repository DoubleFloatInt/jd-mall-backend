package cn.doublefloat.jdmall.common.utils;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author 李广帅
 * @date 2020/8/14 11:07 上午
 */
@SpringBootTest
public class TestIdUtils {

    @Test
    public void testOrderNo() {
        System.out.println(IdUtils.orderNo());
    }
}
