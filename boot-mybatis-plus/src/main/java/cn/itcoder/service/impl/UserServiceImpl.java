package cn.itcoder.service.impl;

import cn.itcoder.model.datasource.UserDO;
import cn.itcoder.model.mapper.UserMapper;
import cn.itcoder.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @CreateTime: 2023-05-31  16:12
 * @Description: TODO
 * @Version: 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public Integer createUser(UserDO user) {
        return userMapper.insert(user);
    }
}
