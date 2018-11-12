package com.xxx.bean;

import java.io.Serializable;

public class Permission implements Serializable {
    /**
     * 权限的id
     */
    private Integer permissionId;

    /**
     * 权限的名称，如update之类的
     */
    private String permissionName;

    /**
     * 权限的描述，如更新之类的
     */
    private String permissionDescription;

    /**
     * permission
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
     * 权限的名称，如update之类的
     * @return permission_name 权限的名称，如update之类的
     */
    public String getPermissionName() {
        return permissionName;
    }

    /**
     * 权限的名称，如update之类的
     * @param permissionName 权限的名称，如update之类的
     */
    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    /**
     * 权限的描述，如更新之类的
     * @return permission_description 权限的描述，如更新之类的
     */
    public String getPermissionDescription() {
        return permissionDescription;
    }

    /**
     * 权限的描述，如更新之类的
     * @param permissionDescription 权限的描述，如更新之类的
     */
    public void setPermissionDescription(String permissionDescription) {
        this.permissionDescription = permissionDescription;
    }
}