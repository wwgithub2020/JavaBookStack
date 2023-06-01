package cn.itcoder.service;

import cn.itcoder.model.datasource.UserDO;

import java.util.List;

public interface UserService {
    Integer createUser(UserDO user);

    Integer updateUser(UserDO user);

    Integer deleteUser(Long id);

    UserDO selectUserById(Long id);
}
