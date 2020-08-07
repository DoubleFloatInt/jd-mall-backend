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

}
