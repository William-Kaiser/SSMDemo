<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<br>
<br>
<h1>用户详情</h1>
姓名：${user.userName}
地址: ${user.address.address}
</br>
<shiro:authenticated>用户已经登录显示此内容</shiro:authenticated></br>
<shiro:hasRole name="manager">manager角色登录显示此内容</shiro:hasRole> </br>
<shiro:hasRole name="admin">admin角色登录显示此内容</shiro:hasRole></br>
<shiro:hasRole name="normal">normal角色登录显示此内容</shiro:hasRole></br>

<shiro:hasAnyRoles name="manager,normal">**manager or normal 角色用户登录显示此内容**</shiro:hasAnyRoles></br>
<shiro:hasPermission name="add">add权限用户显示此内容</shiro:hasPermission></br>
<shiro:hasPermission name="user:query">query权限用户显示此内容</shiro:hasPermission></br>
<shiro:lacksPermission name="del"> 不具有user:del权限的用户显示此内容 </shiro:lacksPermission>



</body>
</html>
