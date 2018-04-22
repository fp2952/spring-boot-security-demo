package com.github.peng.spring.boot.security.demo.service;

import com.github.peng.spring.boot.security.demo.mapper.model.BaseUser;
import com.peng.db.spring.boot.autoconfigure.service.BaseService;
import org.springframework.stereotype.Service;

/**
 * Created by fp295 on 2018/4/7.
 */
@Service
public class BaseUserService extends BaseService<BaseUser> {}
