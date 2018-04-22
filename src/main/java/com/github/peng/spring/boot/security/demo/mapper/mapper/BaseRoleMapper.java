package com.github.peng.spring.boot.security.demo.mapper.mapper;


import com.github.peng.spring.boot.security.demo.mapper.model.BaseRole;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface BaseRoleMapper extends Mapper<BaseRole> {
    List<BaseRole> selectRolesByUserId(String userId);

    List<BaseRole> selectRolesByMenuId(String menuId);
}