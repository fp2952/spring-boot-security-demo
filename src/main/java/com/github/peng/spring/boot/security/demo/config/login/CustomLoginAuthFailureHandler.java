package com.github.peng.spring.boot.security.demo.config.login;

import com.github.peng.spring.boot.security.demo.pojo.ResponseData;
import com.github.peng.spring.boot.security.demo.utils.JsonUtil;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.CredentialsExpiredException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 登陆失败处理
 */
public class CustomLoginAuthFailureHandler implements AuthenticationFailureHandler {
    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
        ResponseData responseData;
        //密码错误
        if ( exception instanceof BadCredentialsException) {
            responseData = new ResponseData(ResponseData.ERROR, "密码错误");
        } else if ( exception instanceof LockedException) {
            //账户被锁
            responseData = new ResponseData(ResponseData.ERROR, "用户被锁定");
        } else if ( exception instanceof DisabledException) {
            //账户未启用
            responseData = new ResponseData(ResponseData.ERROR, "用户未启用");
        } else if ( exception instanceof CredentialsExpiredException) {
            //账户过期
            responseData = new ResponseData(ResponseData.ERROR, "用户已过期");
        }else {
            //其他情况
            responseData = new ResponseData(ResponseData.ERROR, exception.getMessage());
        }
        JsonUtil.writeJson(response, responseData);
}
}