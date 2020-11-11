package com.mta.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tbl_user")
@NoArgsConstructor
@AllArgsConstructor
public class TblUser {
    @Id
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "token")
    private String token;

    @Column(name = "role")
    private String role;

    @Column(name = "last_date")
    private Date lastDate;

    @JoinColumn(name = "profileuser_id", referencedColumnName = "profileuser_id")
    @OneToOne
    private TblProfileuser tblProfileuser;

    @OneToMany
    private List<TblPawncustomer> tblPawncustomer;

    public TblProfileuser getTblProfileuser() {
        return tblProfileuser;
    }

    public void setTblProfileuser(TblProfileuser tblProfileuser) {
        this.tblProfileuser = tblProfileuser;
    }

    public List<TblPawncustomer> getTblPawncustomer() {
        return tblPawncustomer;
    }

    public void setTblPawncustomer(List<TblPawncustomer> tblPawncustomer) {
        this.tblPawncustomer = tblPawncustomer;
    }

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

    public Date getLastDate() {
        return this.lastDate;
    }

    public void setLastDate(Date lastDate) {
        this.lastDate = lastDate;
    }

    public TblProfileuser getProfileuser() {
        return this.tblProfileuser;
    }

    public void setProfileuserId(TblProfileuser profileuser) {
        this.tblProfileuser = profileuser;
    }
}
