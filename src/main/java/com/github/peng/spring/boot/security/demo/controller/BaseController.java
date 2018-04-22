package com.github.peng.spring.boot.security.demo.controller;

import com.github.peng.spring.boot.security.demo.mapper.model.BaseUser;
import com.github.peng.spring.boot.security.demo.service.BaseUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;


public class BaseController {

    @Autowired
    private BaseUserService baseUserService;


    /**
     * 获取当前用户
     * @return
     */
    protected BaseUser getCurrentUser() {
        //获取当前用户
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext()
                .getAuthentication()
                .getPrincipal();

        //查询当前用户
        BaseUser baseUser = new BaseUser();
        baseUser.setUserName(userDetails.getUsername());
        baseUser = baseUserService.selectOne(baseUser);

        if (baseUser == null)
            throw new RuntimeException("用户不存在: " + userDetails.getUsername());

        return baseUser;
    }

}
