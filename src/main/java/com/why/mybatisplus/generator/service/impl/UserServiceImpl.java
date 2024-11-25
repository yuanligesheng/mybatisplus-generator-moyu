package com.why.mybatisplus.generator.service.impl;

import com.why.mybatisplus.generator.model.UserDO;
import com.why.mybatisplus.generator.mapper.UserMapper;
import com.why.mybatisplus.generator.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author why
 * @since 2022-06-29
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserDO> implements UserService {

}
