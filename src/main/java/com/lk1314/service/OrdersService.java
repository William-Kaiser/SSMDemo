/**
 * Copyright &copy; 2015-2020 <a href="http://www.jeeplus.org/">JeePlus</a> All rights reserved.
 */
package com.lk1314.service;

import com.lk1314.core.CrudService;
import com.lk1314.entity.Orders;
import com.lk1314.entity.User;
import com.lk1314.mapper.OrdersMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author liankai
 */
@Service
@Transactional(readOnly = true)
public class OrdersService extends CrudService<OrdersMapper, Orders> {

	@Override
	public Orders get(String id) {
		return super.get(id);
	}

	@Override
	public List<Orders> findList(Orders entity) {
		return super.findList(entity);
	}

	@Override
	@Transactional(readOnly = false)
	public void save(Orders entity) {
		super.save(entity);
	}

	@Override
	@Transactional(readOnly = false)
	public void update(Orders entity) {
		super.update(entity);
	}

	@Override
	@Transactional(readOnly = false)
	public void delete(Orders entity) {
		super.delete(entity);
	}

	public List<User> getUserOrders(Orders entity) {
		return mapper.getUserOrders(entity);
	}

	public List<User> getUserAndOrders(Orders entity) {
		return mapper.getUserAndOrders(entity);
	}

}