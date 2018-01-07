package com.lk1314.test.service;

import com.lk1314.entity.Orders;
import com.lk1314.entity.User;
import com.lk1314.service.OrdersService;
import com.lk1314.service.UserService;
import com.lk1314.test.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author liankai
 */

public class OrderServiceTest extends BaseTest {

    @Autowired
    private OrdersService ordersService;

    @Test
    public void test() {
        Orders orders = new Orders();
        List<User> userList =  ordersService.getUserAndOrders(orders);
    }
}
