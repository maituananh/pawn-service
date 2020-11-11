package com.mta.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tbl_product")
@NoArgsConstructor
@AllArgsConstructor
public class TblProduct {
    @Id
    @Column(name = "product_id")
    private Long productId;

    @JoinColumn(name = "pawncustomer_id", referencedColumnName = "pawncustomer_id")
    @ManyToOne
    private TblPawncustomer tblPawncustomer;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private String type;

    @Column(name = "value")
    private String value;

    @Column(name = "start_day")
    private Date startDay;

    @Column(name = "end_day")
    private Date endDay;

    @Column(name = "profit")
    private Long profit;

    @Column(name = "status")
    private String status;

    @Column(name = "isactive")
    private Boolean isactive;

    @Column(name = "image")
    private String image;

    public Long getProductId() {
        return this.productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public TblPawncustomer getPawncustomer() {
        return this.tblPawncustomer;
    }

    public void setPawncustomer(TblPawncustomer pawncustomer) {
        this.tblPawncustomer = pawncustomer;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Date getStartDay() {
        return this.startDay;
    }

    public void setStartDay(Date startDay) {
        this.startDay = startDay;
    }

    public Date getEndDay() {
        return this.endDay;
    }

    public void setEndDay(Date endDay) {
        this.endDay = endDay;
    }

    public Long getProfit() {
        return this.profit;
    }

    public void setProfit(Long profit) {
        this.profit = profit;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getIsactive() {
        return this.isactive;
    }

    public void setIsactive(Boolean isactive) {
        this.isactive = isactive;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
