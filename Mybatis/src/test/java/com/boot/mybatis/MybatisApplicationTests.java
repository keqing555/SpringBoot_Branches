package com.boot.mybatis;

import com.boot.mybatis.bean.Role;
import com.boot.mybatis.service.RoleService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatisApplicationTests {
    @Autowired
    private RoleService roleService;

    @Test
    public void test1() {
        Role role = roleService.getRoleByRid(1);
        System.out.println(role);
    }

}
