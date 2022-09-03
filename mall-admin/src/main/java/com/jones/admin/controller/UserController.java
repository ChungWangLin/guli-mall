package com.jones.admin.controller;

import com.jones.common.exception.BusinessException;
import com.jones.common.pojo.dto.Result;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("/login")
    public Result login(@RequestBody Map<String,String> loginInfo) {
        String username = MapUtils.getString(loginInfo, "username");
        String password = MapUtils.getString(loginInfo, "password");

        if (StringUtils.isBlank(username) || StringUtils.isBlank(password)) {
            throw new BusinessException("参数错误！");
        }

        System.out.println(username+":"+password);

        return Result.success();
    }
}
