/**
 * Copyright &copy; 2015-2020 <a href="http://www.jeeplus.org/">JeePlus</a> All rights reserved.
 */
package com.lk1314.service;

import com.lk1314.core.CrudService;
import com.lk1314.entity.Role;
import com.lk1314.entity.User;
import com.lk1314.mapper.RoleMapper;
import com.lk1314.mapper.UserMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author liankai
 */
@Service
@Transactional(readOnly = true)
public class RoleService extends CrudService<RoleMapper, Role> {

	public List<Role> selectRolesByUserId(Integer userId){
		return mapper.selectRolesByUserId(userId);
	}

}