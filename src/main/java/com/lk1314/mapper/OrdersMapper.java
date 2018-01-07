package com.lk1314.mapper;

import com.lk1314.core.BaseMapper;
import com.lk1314.entity.Orders;
import com.lk1314.entity.User;

import java.util.List;

/**
 * @author liankai
 */
public interface OrdersMapper extends BaseMapper<Orders> {
    List<User> getUserOrders(Orders orders);

    List<User> getUserAndOrders(Orders orders);
}
