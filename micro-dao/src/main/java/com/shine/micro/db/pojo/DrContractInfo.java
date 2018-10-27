package com.shine.micro.db.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class DrContractInfo {
    private Long id;

    private String bizType;

    private String bizYear;

    private String bizMonth;

    private String cifName;

    private String infoOpType;

    private String idType;

    private String idNo;

    private String pactNo;

    private String occDate;

    private String infoType;

    private String curNo;

    private String authId;

    private String begDate;

    private String endDate;

    private String ifYt;

    private String vouType;

    private String pactSts;

    private String signDate;

    private String lnTradeNo;

    private BigDecimal pactAmt;

    private BigDecimal bal;

    private String loanKind;

    private String termMon;

    private BigDecimal lnRate;

    private String lnType;

    private Date createTime;

    private Date updateTime;

    private String reportDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getCifName() {
        return cifName;
    }

    public void setCifName(String cifName) {
        this.cifName = cifName == null ? null : cifName.trim();
    }

    public String getInfoOpType() {
        return infoOpType;
    }

    public void setInfoOpType(String infoOpType) {
        this.infoOpType = infoOpType == null ? null : infoOpType.trim();
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

    public String getCurNo() {
        return curNo;
    }

    public void setCurNo(String curNo) {
        this.curNo = curNo == null ? null : curNo.trim();
    }

    public String getAuthId() {
        return authId;
    }

    public void setAuthId(String authId) {
        this.authId = authId == null ? null : authId.trim();
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

    public String getIfYt() {
        return ifYt;
    }

    public void setIfYt(String ifYt) {
        this.ifYt = ifYt == null ? null : ifYt.trim();
    }

    public String getVouType() {
        return vouType;
    }

    public void setVouType(String vouType) {
        this.vouType = vouType == null ? null : vouType.trim();
    }

    public String getPactSts() {
        return pactSts;
    }

    public void setPactSts(String pactSts) {
        this.pactSts = pactSts == null ? null : pactSts.trim();
    }

    public String getSignDate() {
        return signDate;
    }

    public void setSignDate(String signDate) {
        this.signDate = signDate == null ? null : signDate.trim();
    }

    public String getLnTradeNo() {
        return lnTradeNo;
    }

    public void setLnTradeNo(String lnTradeNo) {
        this.lnTradeNo = lnTradeNo == null ? null : lnTradeNo.trim();
    }

    public BigDecimal getPactAmt() {
        return pactAmt;
    }

    public void setPactAmt(BigDecimal pactAmt) {
        this.pactAmt = pactAmt;
    }

    public BigDecimal getBal() {
        return bal;
    }

    public void setBal(BigDecimal bal) {
        this.bal = bal;
    }

    public String getLoanKind() {
        return loanKind;
    }

    public void setLoanKind(String loanKind) {
        this.loanKind = loanKind == null ? null : loanKind.trim();
    }

    public String getTermMon() {
        return termMon;
    }

    public void setTermMon(String termMon) {
        this.termMon = termMon == null ? null : termMon.trim();
    }

    public BigDecimal getLnRate() {
        return lnRate;
    }

    public void setLnRate(BigDecimal lnRate) {
        this.lnRate = lnRate;
    }

    public String getLnType() {
        return lnType;
    }

    public void setLnType(String lnType) {
        this.lnType = lnType == null ? null : lnType.trim();
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