package com.feng.service.impl;

import com.feng.entity.User;
import com.feng.mapper.UserMapper;
import com.feng.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lastfeng
 * @since 2022-02-13
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
