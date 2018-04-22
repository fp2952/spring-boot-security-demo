package com.github.peng.spring.boot.security.demo.service;

import com.github.peng.spring.boot.security.demo.mapper.mapper.BaseMenuMapper;
import com.github.peng.spring.boot.security.demo.mapper.model.BaseMenu;
import com.peng.db.spring.boot.autoconfigure.service.BaseService;
import org.springframework.stereotype.Service;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.PathMatcher;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by fp295 on 2018/4/7.
 */
@Service
public class BaseMenuService extends BaseService<BaseMenu> {

    /**
     * 根据用户id查询所属菜单
     * @param userId
     * @return
     */
    public List<BaseMenu> selectRootMenusByUserId(String userId, String userName) {
        return ((BaseMenuMapper)mapper).selectRootMenusByUserId(userId, userName);
    }

    /**
     * 根据url查询所属菜单
     * @param url
     * @return
     */
    public List<BaseMenu> selectMenusByUrl(String url) {
        List<BaseMenu> menuList = mapper.selectAll();
        List<BaseMenu> menus = new ArrayList<>();
        if (menuList != null) {
            menus.addAll(menuList.stream().filter(menu -> urlMatcher(menu.getMenuUrl(), url)).collect(Collectors.toList()));
        }
        return menus;
    }

    private boolean urlMatcher(String permstr, String url) {
        if (permstr == null) {
            return false;
        }
        PathMatcher matcher = new AntPathMatcher();
        return matcher.match(permstr, url);
    }
}
