package com.github.peng.spring.boot.security.demo.service;

import com.github.peng.spring.boot.security.demo.mapper.mapper.BaseRoleMapper;
import com.github.peng.spring.boot.security.demo.mapper.model.BaseRole;
import com.peng.db.spring.boot.autoconfigure.service.BaseService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by fp295 on 2018/4/7.
 */
@Service
public class BaseRoleService extends BaseService<BaseRole> {

    /**
     * 根据用户查询角色
     * @param userId
     * @return
     */
    public List<BaseRole> selectRolesByUserId(String userId) {
        return ((BaseRoleMapper)mapper).selectRolesByUserId(userId);
    }

    /**
     * 根据菜单查询角色
     * @param menuId
     * @return
     */
    public List<BaseRole> selectRolesByMenuId(String menuId) {
        return ((BaseRoleMapper)mapper).selectRolesByMenuId(menuId);
    }
}
