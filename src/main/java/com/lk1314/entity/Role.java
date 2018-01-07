package com.lk1314.entity;

import com.lk1314.core.BaseEntity;

import java.util.List;

/**
 * @author likai
 */
public class Role extends BaseEntity {
    private Integer id;

    private String roleName;
    /**
     *一个角色对应多个权限
     */
    private List<Permission> permissionList;
    /**
     *一个角色对应多个用户
     */
    private List<User> userList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<Permission> getPermissionList() {
        return permissionList;
    }

    public void setPermissionList(List<Permission> permissionList) {
        this.permissionList = permissionList;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}

