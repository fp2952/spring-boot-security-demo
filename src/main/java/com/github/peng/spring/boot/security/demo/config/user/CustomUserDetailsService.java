package com.github.peng.spring.boot.security.demo.config.user;


import com.github.peng.spring.boot.security.demo.mapper.model.BaseRole;
import com.github.peng.spring.boot.security.demo.mapper.model.BaseUser;
import com.github.peng.spring.boot.security.demo.service.BaseRoleService;
import com.github.peng.spring.boot.security.demo.service.BaseUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private BaseUserService baseUserService;

    @Autowired
    private BaseRoleService baseRoleService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        logger.debug("权限框架-加载用户");
        List<GrantedAuthority> auths = new ArrayList<>();

        BaseUser baseUser = new BaseUser();
        baseUser.setUserName(username);
        baseUser = baseUserService.selectOne(baseUser);

        if (baseUser == null) {
            logger.debug("找不到该用户 用户名:{}", username);
            throw new UsernameNotFoundException("找不到该用户！");
        }
        if(baseUser.getStatus()==2)
        {
            logger.debug("用户被禁用，无法登陆 用户名:{}", username);
            throw new UsernameNotFoundException("用户被禁用！");
        }
        List<BaseRole> roles = baseRoleService.selectRolesByUserId(baseUser.getId());
        if (roles != null) {
            //设置角色名称
            for (BaseRole role : roles) {
                SimpleGrantedAuthority authority = new SimpleGrantedAuthority(role.getRoleCode());
                auths.add(authority);
            }
        }

        return new org.springframework.security.core.userdetails.User(baseUser.getUserName(), baseUser.getUserPassword(), true, true, true, true, auths);
    }
}
