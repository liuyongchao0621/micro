package com.shine.micro.db.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class DrRepaySchedule {
    private Long id;

    private String bizId;

    private String bizType;

    private String infoOpType;

    private String bizYearmonth;

    private String dueNo;

    private String acNo;

    private BigDecimal ttlAmt;

    private Long ttlCnt;

    private BigDecimal currAmt;

    private BigDecimal currIntst;

    private Long currCnt;

    private String wrkDate;

    private String begDate;

    private String endDate;

    private String payInd;

    private String tel;

    private String perUpdCode;

    private String updOpNo;

    private String updDate;

    private String occDate;

    private Date createTime;

    private Date updateTime;

    private String reportDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBizId() {
        return bizId;
    }

    public void setBizId(String bizId) {
        this.bizId = bizId == null ? null : bizId.trim();
    }

    public String getBizType() {
        return bizType;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType == null ? null : bizType.trim();
    }

    public String getInfoOpType() {
        return infoOpType;
    }

    public void setInfoOpType(String infoOpType) {
        this.infoOpType = infoOpType == null ? null : infoOpType.trim();
    }

    public String getBizYearmonth() {
        return bizYearmonth;
    }

    public void setBizYearmonth(String bizYearmonth) {
        this.bizYearmonth = bizYearmonth == null ? null : bizYearmonth.trim();
    }

    public String getDueNo() {
        return dueNo;
    }

    public void setDueNo(String dueNo) {
        this.dueNo = dueNo == null ? null : dueNo.trim();
    }

    public String getAcNo() {
        return acNo;
    }

    public void setAcNo(String acNo) {
        this.acNo = acNo == null ? null : acNo.trim();
    }

    public BigDecimal getTtlAmt() {
        return ttlAmt;
    }

    public void setTtlAmt(BigDecimal ttlAmt) {
        this.ttlAmt = ttlAmt;
    }

    public Long getTtlCnt() {
        return ttlCnt;
    }

    public void setTtlCnt(Long ttlCnt) {
        this.ttlCnt = ttlCnt;
    }

    public BigDecimal getCurrAmt() {
        return currAmt;
    }

    public void setCurrAmt(BigDecimal currAmt) {
        this.currAmt = currAmt;
    }

    public BigDecimal getCurrIntst() {
        return currIntst;
    }

    public void setCurrIntst(BigDecimal currIntst) {
        this.currIntst = currIntst;
    }

    public Long getCurrCnt() {
        return currCnt;
    }

    public void setCurrCnt(Long currCnt) {
        this.currCnt = currCnt;
    }

    public String getWrkDate() {
        return wrkDate;
    }

    public void setWrkDate(String wrkDate) {
        this.wrkDate = wrkDate == null ? null : wrkDate.trim();
    }

    public String getBegDate() {
        return begDate;
    }

    public void setBegDate(String begDate) {
        this.begDate = begDate == null ? null : begDate.trim();
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate == null ? null : endDate.trim();
    }

    public String getPayInd() {
        return payInd;
    }

    public void setPayInd(String payInd) {
        this.payInd = payInd == null ? null : payInd.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getPerUpdCode() {
        return perUpdCode;
    }

    public void setPerUpdCode(String perUpdCode) {
        this.perUpdCode = perUpdCode == null ? null : perUpdCode.trim();
    }

    public String getUpdOpNo() {
        return updOpNo;
    }

    public void setUpdOpNo(String updOpNo) {
        this.updOpNo = updOpNo == null ? null : updOpNo.trim();
    }

    public String getUpdDate() {
        return updDate;
    }

    public void setUpdDate(String updDate) {
        this.updDate = updDate == null ? null : updDate.trim();
    }

    public String getOccDate() {
        return occDate;
    }

    public void setOccDate(String occDate) {
        this.occDate = occDate == null ? null : occDate.trim();
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