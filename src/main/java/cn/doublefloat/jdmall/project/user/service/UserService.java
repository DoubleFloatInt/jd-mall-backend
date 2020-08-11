package cn.doublefloat.jdmall.project.user.service;

import cn.doublefloat.jdmall.project.user.domain.User;

/**
 * @author 李广帅
 * @date 2020/8/5 10:55 上午
 */
public interface UserService {

    /**
     * 添加用户信息
     *
     * @param user 用户信息
     * @return 结果
     */
    public Integer add(User user);

    /**
     * 删除用户信息
     * @param userId 用户ID
     * @return 结果
     */
    public Integer deleteUser(Long userId);

    /**
     * 更新用户信息
     * @param user 用户信息
     * @return 结果
     */
    public Integer updateUser(User user);

    /**
     * 根据用户名查询用户信息
     * @param username 用户名
     * @return 用户信息
     */
    public User queryUserByUsername(String username);

}
