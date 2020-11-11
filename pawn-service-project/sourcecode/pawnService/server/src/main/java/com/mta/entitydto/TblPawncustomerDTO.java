package com.mta.entitydto;

public class TblPawncustomerDTO {
    private Long pawncustomerId;
    private TblProfileuserDTO profileuser;
    private TblUserDTO user;
    private String attachedDocuments;
    private Boolean isactive;

    public Long getPawncustomerId() {
        return this.pawncustomerId;
    }

    public void setPawncustomerId(Long pawncustomerId) {
        this.pawncustomerId = pawncustomerId;
    }

    public TblProfileuserDTO getProfileuser() {
        return this.profileuser;
    }

    public void setProfileuser(TblProfileuserDTO profileuser) {
        this.profileuser = profileuser;
    }

    public TblUserDTO getUser() {
        return this.user;
    }

    public void setUser(TblUserDTO user) {
        this.user = user;
    }

    public String getAttachedDocuments() {
        return this.attachedDocuments;
    }

    public void setAttachedDocuments(String attachedDocuments) {
        this.attachedDocuments = attachedDocuments;
    }

    public Boolean getIsactive() {
        return this.isactive;
    }

    public void setIsactive(Boolean isactive) {
        this.isactive = isactive;
    }
}
