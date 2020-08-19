package com.demo.bean;

/**
 * @author xiapp
 * @version 1.0
 * @date 2020/8/19 11:24
 */
public class UserInfo {

    private String userName;
    private String openId;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userName='" + userName + '\'' +
                ", openId='" + openId + '\'' +
                '}';
    }
}
