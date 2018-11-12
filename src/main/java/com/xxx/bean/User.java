package com.xxx.bean;

import java.io.Serializable;

public class User implements Serializable {
    /**
     * 用户的id，做唯一标识
     */
    private Integer userId;

    /**
     * 用户的姓名
     */
    private String userName;

    /**
     * 用户的登录id
     */
    private String loginId;

    /**
     * 用户的密码
     */
    private String password;

    /**
     * 密码的盐
     */
    private String salt;

    /**
     * user
     */
    private static final long serialVersionUID = 1L;

    /**
     * 用户的id，做唯一标识
     * @return user_id 用户的id，做唯一标识
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 用户的id，做唯一标识
     * @param userId 用户的id，做唯一标识
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 用户的姓名
     * @return user_name 用户的姓名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 用户的姓名
     * @param userName 用户的姓名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 用户的登录id
     * @return login_id 用户的登录id
     */
    public String getLoginId() {
        return loginId;
    }

    /**
     * 用户的登录id
     * @param loginId 用户的登录id
     */
    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    /**
     * 用户的密码
     * @return password 用户的密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 用户的密码
     * @param password 用户的密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 密码的盐
     * @return salt 密码的盐
     */
    public String getSalt() {
        return salt;
    }

    /**
     * 密码的盐
     * @param salt 密码的盐
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }
}