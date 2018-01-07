/**
 * Copyright &copy; 2015-2020 <a href="http://www.jeeplus.org/">JeePlus</a> All rights reserved.
 */
package com.lk1314.service;

import com.lk1314.core.CrudService;
import com.lk1314.entity.Role;
import com.lk1314.entity.User;
import com.lk1314.mapper.UserMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author liankai
 */
@Service
@Transactional(readOnly = true)
public class UserService extends CrudService<UserMapper, User> {

	@Override
	public User get(String id) {
		return super.get(id);
	}

	@Override
	public List<User> findList(User user) {
		return super.findList(user);
	}

	@Override
	@Transactional(readOnly = false)
	public void save(User user) {
		super.save(user);
	}

	@Override
	@Transactional(readOnly = false)
	public void update(User entity) {
		super.update(entity);
	}

	@Override
	@Transactional(readOnly = false)
	public void delete(User user) {
		super.delete(user);
	}

	public User selectRolesAndPermsByName(String name){
		return mapper.selectRolesAndPermsByName(name);
	}

}