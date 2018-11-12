package com.xxx.bean;

import java.io.Serializable;

public class RolePermissionKey implements Serializable {
    /**
     * 权限的id
     */
    private Integer permissionId;

    /**
     * 角色名称
     */
    private Integer roleId;

    /**
     * role_permission
     */
    private static final long serialVersionUID = 1L;

    /**
     * 权限的id
     * @return permission_id 权限的id
     */
    public Integer getPermissionId() {
        return permissionId;
    }

    /**
     * 权限的id
     * @param permissionId 权限的id
     */
    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    /**
     * 角色名称
     * @return role_id 角色名称
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * 角色名称
     * @param roleId 角色名称
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}