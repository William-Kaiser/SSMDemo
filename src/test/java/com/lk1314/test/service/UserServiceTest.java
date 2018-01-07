package com.lk1314.test.service;

import com.lk1314.entity.User;
import com.lk1314.service.UserService;
import com.lk1314.test.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author liankai
 */

public class UserServiceTest extends BaseTest {

    @Autowired
    private UserService userService;

    @Test
    public void test() {
        User user =  userService.selectRolesAndPermsByName("小米");
    }
}
