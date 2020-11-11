package com.mta.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tbl_pawncustomer")
@AllArgsConstructor
@NoArgsConstructor
public class TblPawncustomer {
    @Id
    @Column(name = "pawncustomer_id")
    private Long pawncustomerId;

    @JoinColumn(name = "profileuser_id", referencedColumnName = "profileuser_id")
    @OneToOne
    private TblProfileuser tblProfileuser;

    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    @ManyToOne
    private TblUser tblUser;

    @Column(name = "attached_documents")
    private String attachedDocuments;

    @Column(name = "isactive")
    private Boolean isactive;

    @OneToMany
    private List<TblProduct> tblProducts;

    public TblProfileuser getTblProfileuser() {
        return tblProfileuser;
    }

    public void setTblProfileuser(TblProfileuser tblProfileuser) {
        this.tblProfileuser = tblProfileuser;
    }

    public TblUser getTblUser() {
        return tblUser;
    }

    public void setTblUser(TblUser tblUser) {
        this.tblUser = tblUser;
    }

    public List<TblProduct> getTblProducts() {
        return tblProducts;
    }

    public void setTblProducts(List<TblProduct> tblProducts) {
        this.tblProducts = tblProducts;
    }

    public Long getPawncustomerId() {
        return this.pawncustomerId;
    }

    public void setPawncustomerId(Long pawncustomerId) {
        this.pawncustomerId = pawncustomerId;
    }

    public TblProfileuser getProfileuser() {
        return this.tblProfileuser;
    }

    public void setProfileuser(TblProfileuser profileuser) {
        this.tblProfileuser = profileuser;
    }

    public TblUser getUserId() {
        return this.tblUser;
    }

    public void setUserId(TblUser user) {
        this.tblUser = user;
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
