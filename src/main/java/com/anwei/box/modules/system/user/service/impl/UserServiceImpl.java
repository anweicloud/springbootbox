package com.anwei.box.modules.system.user.service.impl;

import com.anwei.box.modules.system.user.entity.User;
import com.anwei.box.modules.system.user.mapper.UserMapper;
import com.anwei.box.modules.system.user.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Anwei
 * @since 2019-06-19
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
