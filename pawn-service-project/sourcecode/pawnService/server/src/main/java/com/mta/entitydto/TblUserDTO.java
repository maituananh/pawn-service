package com.mta.entitydto;

public class TblUserDTO {
    private Long userId;
    private String username;
    private String password;
    private String token;
    private String role;
    private java.sql.Timestamp lastDate;
    private Long profileuserId;

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public java.sql.Timestamp getLastDate() {
        return this.lastDate;
    }

    public void setLastDate(java.sql.Timestamp lastDate) {
        this.lastDate = lastDate;
    }

    public Long getProfileuserId() {
        return this.profileuserId;
    }

    public void setProfileuserId(Long profileuserId) {
        this.profileuserId = profileuserId;
    }
}
