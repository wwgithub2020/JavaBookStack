package cn.itcoder.controller;

import cn.itcoder.commons.CommonResult;
import cn.itcoder.model.datasource.UserDO;
import cn.itcoder.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @PutMapping("/updateUser")
    public CommonResult<Integer> updateUser(@RequestBody UserDO user) {
        Integer updateUser = userService.updateUser(user);
        return CommonResult.success(updateUser);
    }

    @DeleteMapping("/deleteUser")
    public CommonResult<Integer> deleteUser(@RequestParam Long id) {
        Integer deleteUser = userService.deleteUser(id);
        return CommonResult.success(deleteUser);
    }

    @GetMapping("/selectUserList")
    public CommonResult<UserDO> selectUserById(@RequestParam Long id){
        UserDO user = userService.selectUserById(id);
        return CommonResult.success(user);
    }
}
