package com.shine.micro.db.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class DrRepayInfo {
    private Long id;

    private String bizNo;

    private String bizType;

    private String bizYear;

    private String bizMonth;

    private String infoOpType;

    private String cifName;

    private String idType;

    private String idNo;

    private String pactNo;

    private String occDate;

    private String infoType;

    private String dueNo;

    private String returnDate;

    private String counts;

    private String returnType;

    private BigDecimal returnAmt;

    private BigDecimal returnCapital;

    private BigDecimal returnInterest;

    private BigDecimal returnOther;

    private String isOverpay;

    private Date createTime;

    private Date updateTime;

    private String reportDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBizNo() {
        return bizNo;
    }

    public void setBizNo(String bizNo) {
        this.bizNo = bizNo == null ? null : bizNo.trim();
    }

    public String getBizType() {
        return bizType;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType == null ? null : bizType.trim();
    }

    public String getBizYear() {
        return bizYear;
    }

    public void setBizYear(String bizYear) {
        this.bizYear = bizYear == null ? null : bizYear.trim();
    }

    public String getBizMonth() {
        return bizMonth;
    }

    public void setBizMonth(String bizMonth) {
        this.bizMonth = bizMonth == null ? null : bizMonth.trim();
    }

    public String getInfoOpType() {
        return infoOpType;
    }

    public void setInfoOpType(String infoOpType) {
        this.infoOpType = infoOpType == null ? null : infoOpType.trim();
    }

    public String getCifName() {
        return cifName;
    }

    public void setCifName(String cifName) {
        this.cifName = cifName == null ? null : cifName.trim();
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType == null ? null : idType.trim();
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo == null ? null : idNo.trim();
    }

    public String getPactNo() {
        return pactNo;
    }

    public void setPactNo(String pactNo) {
        this.pactNo = pactNo == null ? null : pactNo.trim();
    }

    public String getOccDate() {
        return occDate;
    }

    public void setOccDate(String occDate) {
        this.occDate = occDate == null ? null : occDate.trim();
    }

    public String getInfoType() {
        return infoType;
    }

    public void setInfoType(String infoType) {
        this.infoType = infoType == null ? null : infoType.trim();
    }

    public String getDueNo() {
        return dueNo;
    }

    public void setDueNo(String dueNo) {
        this.dueNo = dueNo == null ? null : dueNo.trim();
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate == null ? null : returnDate.trim();
    }

    public String getCounts() {
        return counts;
    }

    public void setCounts(String counts) {
        this.counts = counts == null ? null : counts.trim();
    }

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType == null ? null : returnType.trim();
    }

    public BigDecimal getReturnAmt() {
        return returnAmt;
    }

    public void setReturnAmt(BigDecimal returnAmt) {
        this.returnAmt = returnAmt;
    }

    public BigDecimal getReturnCapital() {
        return returnCapital;
    }

    public void setReturnCapital(BigDecimal returnCapital) {
        this.returnCapital = returnCapital;
    }

    public BigDecimal getReturnInterest() {
        return returnInterest;
    }

    public void setReturnInterest(BigDecimal returnInterest) {
        this.returnInterest = returnInterest;
    }

    public BigDecimal getReturnOther() {
        return returnOther;
    }

    public void setReturnOther(BigDecimal returnOther) {
        this.returnOther = returnOther;
    }

    public String getIsOverpay() {
        return isOverpay;
    }

    public void setIsOverpay(String isOverpay) {
        this.isOverpay = isOverpay == null ? null : isOverpay.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate == null ? null : reportDate.trim();
    }
}