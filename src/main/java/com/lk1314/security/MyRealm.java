package com.lk1314.security;

import java.util.List;


import com.lk1314.entity.Permission;
import com.lk1314.entity.Role;
import com.lk1314.entity.User;
import com.lk1314.service.RoleService;
import com.lk1314.service.UserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * @author likai
 */

@Component(value = "myRealm")
@Service
@Transactional
public class MyRealm extends AuthorizingRealm{

    @Autowired
    private UserService userService;
    /**
     * 权限认证
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //获取登录时输入的用户名
        String userName=(String) principalCollection.fromRealm(getName()).iterator().next();
        //到数据库查是否有此对象
        User user =  userService.selectRolesAndPermsByName(userName);
        if(user != null){
            //权限信息对象info,用来存放查出的用户的所有的角色（role）及权限（permission）
            SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
            List<Role> roleInfos = user.getRoleList();
            for (Role role : roleInfos){
                //用户的角色集合
                info.addRole(role.getRoleName());
                //用户的角色对应的所有权限，如果只使用角色定义访问权限，下面的四行可以不要
                List<Permission> permList = role.getPermissionList();
                for (Permission perm : permList) {
                    info.addStringPermission(perm.getPermName());
                }
            }

            return info;
        }
        return null;
    }

    /**
     * 登录认证;
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(
            AuthenticationToken authenticationToken) throws AuthenticationException {
        //UsernamePasswordToken对象用来存放提交的登录信息
        UsernamePasswordToken token=(UsernamePasswordToken) authenticationToken;
        //查出是否有此用户
        User user=userService.findUniqueByProperty("username",token.getUsername());
        if(user!=null){
            //若存在，将此用户存放到登录认证info中
            return new SimpleAuthenticationInfo(user.getUserName(), user.getPassword(), getName());
        }
        return null;
    }

}