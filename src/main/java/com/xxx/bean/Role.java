package com.xxx.bean;

import java.io.Serializable;

public class Role implements Serializable {
    /**
     * 角色的id
     */
    private Integer roleId;

    /**
     * 角色的名称
     */
    private String roleName;

    /**
     * role
     */
    private static final long serialVersionUID = 1L;

    /**
     * 角色的id
     * @return role_id 角色的id
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * 角色的id
     * @param roleId 角色的id
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * 角色的名称
     * @return role_name 角色的名称
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 角色的名称
     * @param roleName 角色的名称
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}