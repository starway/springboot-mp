package com.cuicui.demomp.sys.service.impl;

import com.cuicui.demomp.sys.entity.User;
import com.cuicui.demomp.sys.mapper.UserMapper;
import com.cuicui.demomp.sys.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author Cuicui
 * @since 2020-06-08
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
