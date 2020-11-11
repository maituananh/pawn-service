package com.mta.entitydto;

import java.util.Date;

public class TblProductDTO {
    private Long productId;
    private Long pawncustomerId;
    private String name;
    private String type;
    private String value;
    private Date startDay;
    private Date endDay;
    private Long profit;
    private String status;
    private Boolean isactive;
    private String image;

    public Long getProductId() {
        return this.productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getPawncustomerId() {
        return this.pawncustomerId;
    }

    public void setPawncustomerId(Long pawncustomerId) {
        this.pawncustomerId = pawncustomerId;
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
