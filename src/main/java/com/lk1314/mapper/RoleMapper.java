package com.lk1314.mapper;

import com.lk1314.core.BaseMapper;
import com.lk1314.entity.Role;

import java.util.List;

/**
 * @author liankai
 */
public interface RoleMapper extends BaseMapper<Role> {
    List<Role> selectRolesByUserId(Integer userId);
}
