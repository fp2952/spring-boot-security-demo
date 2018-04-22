package com.github.peng.spring.boot.security.demo.mapper.mapper;


import com.github.peng.spring.boot.security.demo.mapper.model.BaseMenu;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface BaseMenuMapper extends Mapper<BaseMenu> {
    List<BaseMenu> selectRootMenusByUserId(@Param("userId") String userId, @Param("userName")String userName);
}