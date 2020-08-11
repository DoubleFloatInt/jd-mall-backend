package cn.doublefloat.jdmall.project.user.service.impl;

import cn.doublefloat.jdmall.project.user.domain.User;
import cn.doublefloat.jdmall.project.user.mapper.UserMapper;
import cn.doublefloat.jdmall.project.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author 李广帅
 * @date 2020/8/5 10:55 上午
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public Integer add(User user) {
        user.setNickname("jd-mall" + user.getUsername());
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setCreateTime(new Date());
        return userMapper.add(user);
    }

    @Override
    public Integer deleteUser(Long userId) {
        return null;
    }

    @Override
    public Integer updateUser(User user) {
        return null;
    }

    @Override
    public User queryUserByUsername(String username) {
        return userMapper.queryUserByUsername(username);
    }
}
