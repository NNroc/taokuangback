package com.flying.taokuang.dataobject;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @date 2019/08/24
 */
public class User implements Common {
    private Integer userId;

    private String token;

    /**
     * 学号
     */
    private String studentId;

    /**
     * 学生证
     */
    private String studentIdCard;

    /**
     * 权限
     */
    private String authority;

    /**
     * 学生认证
     */
    private Integer agree;

    /**
     * 使用者姓名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 头像
     */
    private String picture;

    /**
     * 手机号
     */
    private String mobilePhoneNumber;

    /**
     * 手机号验证
     */
    private Integer mobilePhoneNumberVerified;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 邮箱验证
     */
    private Integer emailVerified;

    private Date createdDate;

    private Date updatedDate;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentIdCard() {
        return studentIdCard;
    }

    public void setStudentIdCard(String studentIdCard) {
        this.studentIdCard = studentIdCard;
    }

    public Integer getAgree() {
        return agree;
    }

    public void setAgree(Integer agree) {
        this.agree = agree;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public Integer getMobilePhoneNumberVerified() {
        return mobilePhoneNumberVerified;
    }

    public void setMobilePhoneNumberVerified(Integer mobilePhoneNumberVerified) {
        this.mobilePhoneNumberVerified = mobilePhoneNumberVerified;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getEmailVerified() {
        return emailVerified;
    }

    public void setEmailVerified(Integer emailVerified) {
        this.emailVerified = emailVerified;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public Map toDict() {
        Map<Object, Object> map = new HashMap<>();
        map.put("studentId", studentId);
        map.put("studentIdCard", studentIdCard);
        map.put("authority", authority);
        map.put("agree", agree);
        map.put("username", username);
        map.put("picture", picture);
        map.put("mobilePhoneNumber", mobilePhoneNumber);
        map.put("mobilePhoneNumberVerified", mobilePhoneNumberVerified);
        map.put("email", email);
        map.put("emailVerified", emailVerified);
        return map;
    }
}