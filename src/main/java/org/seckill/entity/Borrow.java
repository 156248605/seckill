package org.seckill.entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;
/**
 * Created by piaomiao on 2017/2/1.
 */
public class Borrow {
    @Id
    private Integer id;

    private Integer siteId;

    private Integer userId;

    private String borrowTitle;

    private Integer borrowStatus;

    private Integer borrowSequence;

    private Integer borrowHits;

    private Integer isVouch;

    private BigDecimal vouchPercentage;

    private BigDecimal vouchMoney;

    private String vouchUser;

    private BigDecimal vouchFee;

    private String vouchRemark;

    private String vouchDepositTrxId;

    private Date publishDatetime;

    private Integer verifyTrialUser;

    private Date verifyTrialTime;

    private String verifyTrialRemark;

    private Integer verifyReviewUser;

    private Date verifyReviewTime;

    private String verifyReviewRemark;

    private Integer publishReviewUser;

    private Date publishReviewTime;

    private String publishReviewRemark;

    private Integer fullReviewUser;

    private Date fullReviewTime;

    private String fullReviewRemark;

    private Integer repaymentUser;

    private BigDecimal repaymentAmount;

    private BigDecimal monthlyRepayment;

    private BigDecimal paidAmount;

    private BigDecimal paidInterest;

    private Date repaymentTime;

    private Date successTime;

    private Date endTime;

    private BigDecimal paymentAmount;

    private String borrowUse;

    private Integer borrowTimeLimit;

    private Integer repaymentStyle;

    private BigDecimal tenderSum;

    private BigDecimal borrowSum;

    private BigDecimal loanFee;

    private BigDecimal loanMoney;

    private Integer tenderTimes;

    private BigDecimal annualInterestRate;

    private BigDecimal minAmount;

    private BigDecimal maxAmount;

    private Integer validTime;

    private String tenderAward;

    private BigDecimal partAmount;

    private BigDecimal proportionRate;

    private Integer isFalse;

    private Integer openAccount;

    private Integer openBorrow;

    private Integer openTender;

    private Integer openCredit;

    private Date borrowAddtime;

    private String borrowAddip;

    private Integer bidKind;

    private String tenderPassword;

    private Integer isDay;

    private String payDatetime;

    private Integer userTypeId;

    private Integer bidRank;

    private Date allowTenderTime;

    private BigDecimal minWaitRepossess;

    private String borrowNo;

    private BigDecimal amountPerCopies;

    private String agreementPath;

    private Date prePublishDatetime;

    private BigDecimal extraInterestRate;

    private BigDecimal regularInterestRate;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSiteId() {
        return siteId;
    }

    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getBorrowTitle() {
        return borrowTitle;
    }

    public void setBorrowTitle(String borrowTitle) {
        this.borrowTitle = borrowTitle == null ? null : borrowTitle.trim();
    }

    public Integer getBorrowStatus() {
        return borrowStatus;
    }

    public void setBorrowStatus(Integer borrowStatus) {
        this.borrowStatus = borrowStatus;
    }

    public Integer getBorrowSequence() {
        return borrowSequence;
    }

    public void setBorrowSequence(Integer borrowSequence) {
        this.borrowSequence = borrowSequence;
    }

    public Integer getBorrowHits() {
        return borrowHits;
    }

    public void setBorrowHits(Integer borrowHits) {
        this.borrowHits = borrowHits;
    }

    public Integer getIsVouch() {
        return isVouch;
    }

    public void setIsVouch(Integer isVouch) {
        this.isVouch = isVouch;
    }

    public BigDecimal getVouchPercentage() {
        return vouchPercentage;
    }

    public void setVouchPercentage(BigDecimal vouchPercentage) {
        this.vouchPercentage = vouchPercentage;
    }

    public BigDecimal getVouchMoney() {
        return vouchMoney;
    }

    public void setVouchMoney(BigDecimal vouchMoney) {
        this.vouchMoney = vouchMoney;
    }

    public String getVouchUser() {
        return vouchUser;
    }

    public void setVouchUser(String vouchUser) {
        this.vouchUser = vouchUser == null ? null : vouchUser.trim();
    }

    public BigDecimal getVouchFee() {
        return vouchFee;
    }

    public void setVouchFee(BigDecimal vouchFee) {
        this.vouchFee = vouchFee;
    }

    public String getVouchRemark() {
        return vouchRemark;
    }

    public void setVouchRemark(String vouchRemark) {
        this.vouchRemark = vouchRemark == null ? null : vouchRemark.trim();
    }

    public String getVouchDepositTrxId() {
        return vouchDepositTrxId;
    }

    public void setVouchDepositTrxId(String vouchDepositTrxId) {
        this.vouchDepositTrxId = vouchDepositTrxId == null ? null : vouchDepositTrxId.trim();
    }

    public Date getPublishDatetime() {
        return publishDatetime;
    }

    public void setPublishDatetime(Date publishDatetime) {
        this.publishDatetime = publishDatetime;
    }

    public Integer getVerifyTrialUser() {
        return verifyTrialUser;
    }

    public void setVerifyTrialUser(Integer verifyTrialUser) {
        this.verifyTrialUser = verifyTrialUser;
    }

    public Date getVerifyTrialTime() {
        return verifyTrialTime;
    }

    public void setVerifyTrialTime(Date verifyTrialTime) {
        this.verifyTrialTime = verifyTrialTime;
    }

    public String getVerifyTrialRemark() {
        return verifyTrialRemark;
    }

    public void setVerifyTrialRemark(String verifyTrialRemark) {
        this.verifyTrialRemark = verifyTrialRemark == null ? null : verifyTrialRemark.trim();
    }

    public Integer getVerifyReviewUser() {
        return verifyReviewUser;
    }

    public void setVerifyReviewUser(Integer verifyReviewUser) {
        this.verifyReviewUser = verifyReviewUser;
    }

    public Date getVerifyReviewTime() {
        return verifyReviewTime;
    }

    public void setVerifyReviewTime(Date verifyReviewTime) {
        this.verifyReviewTime = verifyReviewTime;
    }

    public String getVerifyReviewRemark() {
        return verifyReviewRemark;
    }

    public void setVerifyReviewRemark(String verifyReviewRemark) {
        this.verifyReviewRemark = verifyReviewRemark == null ? null : verifyReviewRemark.trim();
    }

    public Integer getPublishReviewUser() {
        return publishReviewUser;
    }

    public void setPublishReviewUser(Integer publishReviewUser) {
        this.publishReviewUser = publishReviewUser;
    }

    public Date getPublishReviewTime() {
        return publishReviewTime;
    }

    public void setPublishReviewTime(Date publishReviewTime) {
        this.publishReviewTime = publishReviewTime;
    }

    public String getPublishReviewRemark() {
        return publishReviewRemark;
    }

    public void setPublishReviewRemark(String publishReviewRemark) {
        this.publishReviewRemark = publishReviewRemark == null ? null : publishReviewRemark.trim();
    }

    public Integer getFullReviewUser() {
        return fullReviewUser;
    }

    public void setFullReviewUser(Integer fullReviewUser) {
        this.fullReviewUser = fullReviewUser;
    }

    public Date getFullReviewTime() {
        return fullReviewTime;
    }

    public void setFullReviewTime(Date fullReviewTime) {
        this.fullReviewTime = fullReviewTime;
    }

    public String getFullReviewRemark() {
        return fullReviewRemark;
    }

    public void setFullReviewRemark(String fullReviewRemark) {
        this.fullReviewRemark = fullReviewRemark == null ? null : fullReviewRemark.trim();
    }

    public Integer getRepaymentUser() {
        return repaymentUser;
    }

    public void setRepaymentUser(Integer repaymentUser) {
        this.repaymentUser = repaymentUser;
    }

    public BigDecimal getRepaymentAmount() {
        return repaymentAmount;
    }

    public void setRepaymentAmount(BigDecimal repaymentAmount) {
        this.repaymentAmount = repaymentAmount;
    }

    public BigDecimal getMonthlyRepayment() {
        return monthlyRepayment;
    }

    public void setMonthlyRepayment(BigDecimal monthlyRepayment) {
        this.monthlyRepayment = monthlyRepayment;
    }

    public BigDecimal getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(BigDecimal paidAmount) {
        this.paidAmount = paidAmount;
    }

    public BigDecimal getPaidInterest() {
        return paidInterest;
    }

    public void setPaidInterest(BigDecimal paidInterest) {
        this.paidInterest = paidInterest;
    }

    public Date getRepaymentTime() {
        return repaymentTime;
    }

    public void setRepaymentTime(Date repaymentTime) {
        this.repaymentTime = repaymentTime;
    }

    public Date getSuccessTime() {
        return successTime;
    }

    public void setSuccessTime(Date successTime) {
        this.successTime = successTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getBorrowUse() {
        return borrowUse;
    }

    public void setBorrowUse(String borrowUse) {
        this.borrowUse = borrowUse == null ? null : borrowUse.trim();
    }

    public Integer getBorrowTimeLimit() {
        return borrowTimeLimit;
    }

    public void setBorrowTimeLimit(Integer borrowTimeLimit) {
        this.borrowTimeLimit = borrowTimeLimit;
    }

    public Integer getRepaymentStyle() {
        return repaymentStyle;
    }

    public void setRepaymentStyle(Integer repaymentStyle) {
        this.repaymentStyle = repaymentStyle;
    }

    public BigDecimal getTenderSum() {
        return tenderSum;
    }

    public void setTenderSum(BigDecimal tenderSum) {
        this.tenderSum = tenderSum;
    }

    public BigDecimal getBorrowSum() {
        return borrowSum;
    }

    public void setBorrowSum(BigDecimal borrowSum) {
        this.borrowSum = borrowSum;
    }

    public BigDecimal getLoanFee() {
        return loanFee;
    }

    public void setLoanFee(BigDecimal loanFee) {
        this.loanFee = loanFee;
    }

    public BigDecimal getLoanMoney() {
        return loanMoney;
    }

    public void setLoanMoney(BigDecimal loanMoney) {
        this.loanMoney = loanMoney;
    }

    public Integer getTenderTimes() {
        return tenderTimes;
    }

    public void setTenderTimes(Integer tenderTimes) {
        this.tenderTimes = tenderTimes;
    }

    public BigDecimal getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(BigDecimal annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public BigDecimal getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(BigDecimal minAmount) {
        this.minAmount = minAmount;
    }

    public BigDecimal getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(BigDecimal maxAmount) {
        this.maxAmount = maxAmount;
    }

    public Integer getValidTime() {
        return validTime;
    }

    public void setValidTime(Integer validTime) {
        this.validTime = validTime;
    }

    public String getTenderAward() {
        return tenderAward;
    }

    public void setTenderAward(String tenderAward) {
        this.tenderAward = tenderAward == null ? null : tenderAward.trim();
    }

    public BigDecimal getPartAmount() {
        return partAmount;
    }

    public void setPartAmount(BigDecimal partAmount) {
        this.partAmount = partAmount;
    }

    public BigDecimal getProportionRate() {
        return proportionRate;
    }

    public void setProportionRate(BigDecimal proportionRate) {
        this.proportionRate = proportionRate;
    }

    public Integer getIsFalse() {
        return isFalse;
    }

    public void setIsFalse(Integer isFalse) {
        this.isFalse = isFalse;
    }

    public Integer getOpenAccount() {
        return openAccount;
    }

    public void setOpenAccount(Integer openAccount) {
        this.openAccount = openAccount;
    }

    public Integer getOpenBorrow() {
        return openBorrow;
    }

    public void setOpenBorrow(Integer openBorrow) {
        this.openBorrow = openBorrow;
    }

    public Integer getOpenTender() {
        return openTender;
    }

    public void setOpenTender(Integer openTender) {
        this.openTender = openTender;
    }

    public Integer getOpenCredit() {
        return openCredit;
    }

    public void setOpenCredit(Integer openCredit) {
        this.openCredit = openCredit;
    }

    public Date getBorrowAddtime() {
        return borrowAddtime;
    }

    public void setBorrowAddtime(Date borrowAddtime) {
        this.borrowAddtime = borrowAddtime;
    }

    public String getBorrowAddip() {
        return borrowAddip;
    }

    public void setBorrowAddip(String borrowAddip) {
        this.borrowAddip = borrowAddip == null ? null : borrowAddip.trim();
    }

    public Integer getBidKind() {
        return bidKind;
    }

    public void setBidKind(Integer bidKind) {
        this.bidKind = bidKind;
    }

    public String getTenderPassword() {
        return tenderPassword;
    }

    public void setTenderPassword(String tenderPassword) {
        this.tenderPassword = tenderPassword == null ? null : tenderPassword.trim();
    }

    public Integer getIsDay() {
        return isDay;
    }

    public void setIsDay(Integer isDay) {
        this.isDay = isDay;
    }

    public String getPayDatetime() {
        return payDatetime;
    }

    public void setPayDatetime(String payDatetime) {
        this.payDatetime = payDatetime == null ? null : payDatetime.trim();
    }

    public Integer getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(Integer userTypeId) {
        this.userTypeId = userTypeId;
    }

    public Integer getBidRank() {
        return bidRank;
    }

    public void setBidRank(Integer bidRank) {
        this.bidRank = bidRank;
    }

    public Date getAllowTenderTime() {
        return allowTenderTime;
    }

    public void setAllowTenderTime(Date allowTenderTime) {
        this.allowTenderTime = allowTenderTime;
    }

    public BigDecimal getMinWaitRepossess() {
        return minWaitRepossess;
    }

    public void setMinWaitRepossess(BigDecimal minWaitRepossess) {
        this.minWaitRepossess = minWaitRepossess;
    }

    public String getBorrowNo() {
        return borrowNo;
    }

    public void setBorrowNo(String borrowNo) {
        this.borrowNo = borrowNo == null ? null : borrowNo.trim();
    }

    public BigDecimal getAmountPerCopies() {
        return amountPerCopies;
    }

    public void setAmountPerCopies(BigDecimal amountPerCopies) {
        this.amountPerCopies = amountPerCopies;
    }

    public String getAgreementPath() {
        return agreementPath;
    }

    public void setAgreementPath(String agreementPath) {
        this.agreementPath = agreementPath == null ? null : agreementPath.trim();
    }

    public Date getPrePublishDatetime() {
        return prePublishDatetime;
    }

    public void setPrePublishDatetime(Date prePublishDatetime) {
        this.prePublishDatetime = prePublishDatetime;
    }

    public BigDecimal getExtraInterestRate() {
        return extraInterestRate;
    }

    public void setExtraInterestRate(BigDecimal extraInterestRate) {
        this.extraInterestRate = extraInterestRate;
    }

    public BigDecimal getRegularInterestRate() {
        return regularInterestRate;
    }

    public void setRegularInterestRate(BigDecimal regularInterestRate) {
        this.regularInterestRate = regularInterestRate;
    }











}
