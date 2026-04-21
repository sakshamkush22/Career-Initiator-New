
package com.userRegistrationBean;

public class UserRegistrationBean {
    private int userId;
    private String userName;
    private String email;
    private String whatssapNo;
    private String password;
    private String address;
    private String stream;
    private String level;

    public UserRegistrationBean() {
    }

    public UserRegistrationBean(int userId, String userName, String email, String whatssapNo, String password, String address, String stream, String level) {
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.whatssapNo = whatssapNo;
        this.password = password;
        this.address = address;
        this.stream = stream;
        this.level = level;
    }

    @Override
    public String toString() {
        return "UserRegistrationBean{" + "userId=" + userId + ", userName=" + userName + ", email=" + email + ", whatssapNo=" + whatssapNo + ", password=" + password + ", address=" + address + ", stream=" + stream + ", level=" + level + '}';
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWhatssapNo() {
        return whatssapNo;
    }

    public void setWhatssapNo(String whatssapNo) {
        this.whatssapNo = whatssapNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
    
    



}
