package com.lk1314.mapper;

import com.lk1314.core.BaseMapper;
import com.lk1314.entity.User;

public interface UserMapper extends BaseMapper<User> {

    User selectRolesAndPermsByName(String name);
}
