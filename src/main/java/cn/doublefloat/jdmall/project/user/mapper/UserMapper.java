package cn.doublefloat.jdmall.project.user.mapper;

import cn.doublefloat.jdmall.project.user.domain.User;
import org.springframework.stereotype.Repository;

/**
 * @author 李广帅
 * @date 2020/8/5 10:54 上午
 */
@Repository
public interface UserMapper {

    /**
     * 添加用户信息
     *
     * @param user 用户信息
     * @return 结果
     */
    public Integer add(User user);

    /**
     * 根据用户名查询用户信息
     * @param username 用户名
     * @return 用户信息
     */
    public User queryUserByUsername(String username);
}
