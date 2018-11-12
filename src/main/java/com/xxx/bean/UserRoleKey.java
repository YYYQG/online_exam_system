package com.xxx.bean;

import java.io.Serializable;

public class UserRoleKey implements Serializable {
    /**
     * 
     */
    private Integer userId;

    /**
     * 
     */
    private Integer roleId;

    /**
     * user_role
     */
    private static final long serialVersionUID = 1L;

    /**
     * 
     * @return user_id 
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 
     * @param userId 
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 
     * @return role_id 
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * 
     * @param roleId 
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}