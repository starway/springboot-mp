package com.cuicui.demomp.sys.controller;


import com.cuicui.demomp.sys.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author Cuicui
 * @since 2020-06-08
 */
@RestController
@RequestMapping("/sys/user")
@Api(tags = "用户管理")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/hello")
    @ApiOperation(value = "你好")
    public String hello() {
        return "ok";
    }


}
