package cn.itcoder.controller;

import cn.itcoder.commons.CommonResult;
import cn.itcoder.model.datasource.UserDO;
import cn.itcoder.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @CreateTime: 2023-05-31  16:09
 * @Description: TODO
 * @Version: 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/createUser")
    public CommonResult<Integer> createUser(@RequestBody UserDO user) {
        Integer result = userService.createUser(user);
        return CommonResult.success(result);
    }
}
