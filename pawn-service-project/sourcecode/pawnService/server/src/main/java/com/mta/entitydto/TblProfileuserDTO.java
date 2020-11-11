package com.mta.entitydto;

public class TblProfileuserDTO {
    private Long profileuserId;
    private String email;
    private String phone;
    private String address;
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
