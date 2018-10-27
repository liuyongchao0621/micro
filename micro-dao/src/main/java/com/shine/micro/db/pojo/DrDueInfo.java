package com.shine.micro.db.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class DrDueInfo {
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

    private String dueNo;

    private String curNo;

    private BigDecimal dueAmt;

    private BigDecimal bal;

    private String begDate;

    private String endDate;

    private String occurType;

    private String loanType;

    private String lnTradeNo;

    private String loanKind;

    private String expFlag;

    private String fourSts;

    private String fiveSts;

    private String baseRate;

    private BigDecimal lnRate;

    private BigDecimal overRate;

    private BigDecimal fineRate;

    private BigDecimal cmpdRate;

    private BigDecimal expRate;

    private BigDecimal innerIntst;

    private BigDecimal outerIntst;

    private String returnCount;

    private BigDecimal accFee;

    private BigDecimal accTolFee;

    private String lnType;

    private String repayType;

    private String graceDay;

    private String verificaFlag;

    private String loanStatus;

    private Date createTime;

    private Date updateTime;

    private Integer loanTerm;

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

    public String getDueNo() {
        return dueNo;
    }

    public void setDueNo(String dueNo) {
        this.dueNo = dueNo == null ? null : dueNo.trim();
    }

    public String getCurNo() {
        return curNo;
    }

    public void setCurNo(String curNo) {
        this.curNo = curNo == null ? null : curNo.trim();
    }

    public BigDecimal getDueAmt() {
        return dueAmt;
    }

    public void setDueAmt(BigDecimal dueAmt) {
        this.dueAmt = dueAmt;
    }

    public BigDecimal getBal() {
        return bal;
    }

    public void setBal(BigDecimal bal) {
        this.bal = bal;
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

    public String getOccurType() {
        return occurType;
    }

    public void setOccurType(String occurType) {
        this.occurType = occurType == null ? null : occurType.trim();
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType == null ? null : loanType.trim();
    }

    public String getLnTradeNo() {
        return lnTradeNo;
    }

    public void setLnTradeNo(String lnTradeNo) {
        this.lnTradeNo = lnTradeNo == null ? null : lnTradeNo.trim();
    }

    public String getLoanKind() {
        return loanKind;
    }

    public void setLoanKind(String loanKind) {
        this.loanKind = loanKind == null ? null : loanKind.trim();
    }

    public String getExpFlag() {
        return expFlag;
    }

    public void setExpFlag(String expFlag) {
        this.expFlag = expFlag == null ? null : expFlag.trim();
    }

    public String getFourSts() {
        return fourSts;
    }

    public void setFourSts(String fourSts) {
        this.fourSts = fourSts == null ? null : fourSts.trim();
    }

    public String getFiveSts() {
        return fiveSts;
    }

    public void setFiveSts(String fiveSts) {
        this.fiveSts = fiveSts == null ? null : fiveSts.trim();
    }

    public String getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(String baseRate) {
        this.baseRate = baseRate == null ? null : baseRate.trim();
    }

    public BigDecimal getLnRate() {
        return lnRate;
    }

    public void setLnRate(BigDecimal lnRate) {
        this.lnRate = lnRate;
    }

    public BigDecimal getOverRate() {
        return overRate;
    }

    public void setOverRate(BigDecimal overRate) {
        this.overRate = overRate;
    }

    public BigDecimal getFineRate() {
        return fineRate;
    }

    public void setFineRate(BigDecimal fineRate) {
        this.fineRate = fineRate;
    }

    public BigDecimal getCmpdRate() {
        return cmpdRate;
    }

    public void setCmpdRate(BigDecimal cmpdRate) {
        this.cmpdRate = cmpdRate;
    }

    public BigDecimal getExpRate() {
        return expRate;
    }

    public void setExpRate(BigDecimal expRate) {
        this.expRate = expRate;
    }

    public BigDecimal getInnerIntst() {
        return innerIntst;
    }

    public void setInnerIntst(BigDecimal innerIntst) {
        this.innerIntst = innerIntst;
    }

    public BigDecimal getOuterIntst() {
        return outerIntst;
    }

    public void setOuterIntst(BigDecimal outerIntst) {
        this.outerIntst = outerIntst;
    }

    public String getReturnCount() {
        return returnCount;
    }

    public void setReturnCount(String returnCount) {
        this.returnCount = returnCount == null ? null : returnCount.trim();
    }

    public BigDecimal getAccFee() {
        return accFee;
    }

    public void setAccFee(BigDecimal accFee) {
        this.accFee = accFee;
    }

    public BigDecimal getAccTolFee() {
        return accTolFee;
    }

    public void setAccTolFee(BigDecimal accTolFee) {
        this.accTolFee = accTolFee;
    }

    public String getLnType() {
        return lnType;
    }

    public void setLnType(String lnType) {
        this.lnType = lnType == null ? null : lnType.trim();
    }

    public String getRepayType() {
        return repayType;
    }

    public void setRepayType(String repayType) {
        this.repayType = repayType == null ? null : repayType.trim();
    }

    public String getGraceDay() {
        return graceDay;
    }

    public void setGraceDay(String graceDay) {
        this.graceDay = graceDay == null ? null : graceDay.trim();
    }

    public String getVerificaFlag() {
        return verificaFlag;
    }

    public void setVerificaFlag(String verificaFlag) {
        this.verificaFlag = verificaFlag == null ? null : verificaFlag.trim();
    }

    public String getLoanStatus() {
        return loanStatus;
    }

    public void setLoanStatus(String loanStatus) {
        this.loanStatus = loanStatus == null ? null : loanStatus.trim();
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

    public Integer getLoanTerm() {
        return loanTerm;
    }

    public void setLoanTerm(Integer loanTerm) {
        this.loanTerm = loanTerm;
    }

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate == null ? null : reportDate.trim();
    }
}