package com.boot.mybatis.service;

import com.boot.mybatis.bean.Role;
import com.boot.mybatis.dao.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService{
    @Autowired
    private RoleMapper roleMapper;
    @Override
    public Role getRoleByRid(int rid) {
        return roleMapper.getRoleByRid(rid);
    }
}
