package cn.itcoder.service;

import cn.itcoder.commons.PageResult;
import cn.itcoder.model.datasource.UserDO;
import cn.itcoder.model.vo.UserReqVO;


public interface UserService {
    Integer createUser(UserDO user);

    Integer updateUser(UserDO user);

    Integer deleteUser(Long id);

    UserDO selectUserById(Long id);

    PageResult<UserDO> selectUserPage(UserReqVO userReqVO);
}
