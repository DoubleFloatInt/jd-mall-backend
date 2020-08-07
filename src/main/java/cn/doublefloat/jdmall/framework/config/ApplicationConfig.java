package cn.doublefloat.jdmall.framework.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author 李广帅
 * @date 2020/8/4 5:02 下午
 */
@Configuration
@MapperScan("cn/doublefloat/jdmall/project/**/mapper")
public class ApplicationConfig {
}
