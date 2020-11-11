package com.mta.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tbl_profileuser")
@NoArgsConstructor
@AllArgsConstructor
public class TblProfileuser {
    @Id
    @Column(name = "profileuser_id")
    private Long profileuserId;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "address")
    private String address;

    @Column(name = "fullname")
    private String fullname;


    public Long getProfileuserId() {
        return this.profileuserId;
    }

    public void setProfileuserId(Long profileuserId) {
        this.profileuserId = profileuserId;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFullname() {
        return this.fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
}
