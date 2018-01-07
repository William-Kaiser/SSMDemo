package com.lk1314.entity;

import com.lk1314.core.BaseEntity;

/**
 * @author likai
 */
public class Permission extends BaseEntity {

    private Integer id;
    private String permName;
    /**
     *一个权限对应一个角色
     */
    private Role role;

    private Integer roleId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPermName() {
        return permName;
    }

    public void setPermName(String permName) {
        this.permName = permName;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}

