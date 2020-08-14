package cn.doublefloat.jdmall.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

/**
 * @author 李广帅
 * @date 2020/8/11 2:41 下午
 */
public class IdUtils {
    /**
     * 随机生成UUID
     *
     * @return UUID字符串
     */
    public static String randomUUID() {
        return UUID.randomUUID().toString();
    }

    /**
     * 简化UUID，无横线
     *
     * @return UUID字符串
     */
    public static String simpleUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }


    /**
     * 生成订单编号
     *
     * @return 订单编号
     */
    public static String orderNo() {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        int x;
        Random ne = new Random();
        x = ne.nextInt(9999 - 1000 + 1) + 1000;
        return dateFormat.format(date) + x;
    }
}
