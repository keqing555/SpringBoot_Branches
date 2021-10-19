package com.boot.mybatis.dao;

import com.boot.mybatis.bean.Role;
import org.apache.ibatis.annotations.Mapper;

@Mapper //创建接口代理对象
public interface RoleMapper {
    Role getRoleByRid(int rid);

}
