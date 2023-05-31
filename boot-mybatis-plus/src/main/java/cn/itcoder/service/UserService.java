package cn.itcoder.service;

import cn.itcoder.model.datasource.UserDO;

public interface UserService {
    Integer createUser(UserDO user);
}
