package com.lk1314.test.service;

import com.lk1314.entity.Role;
import com.lk1314.entity.User;
import com.lk1314.service.RoleService;
import com.lk1314.service.UserService;
import com.lk1314.test.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author liankai
 */

public class RoleServiceTest extends BaseTest {

    @Autowired
    private RoleService roleService;

    @Test
    public void test() {
        List<Role> roleInfos = roleService.selectRolesByUserId(1);
    }
}
