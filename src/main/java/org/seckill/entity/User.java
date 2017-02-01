package org.seckill.entity;
import javax.persistence.Id;
import java.util.Date;
public class User {
    @Id
    private Integer id;

    private Integer typeId;

    private String userAccount;

    private String userPassword;

    private String userPaypassword;

    private Integer userVouch;

    private Integer userIslock;

    private Integer inviteUserid;

    private String inviteMoney;

    private Integer cardType;

    private String cardNumber;

    private String cardFrontImg;

    private String cardBackImg;

    private String userNation;

    private String userRealname;

    private String userIntegral;

    private Integer avatarStatus;

    private Integer realnameStatus;

    private Integer emailStatus;

    private Integer phoneStatus;

    private Integer videoStatus;

    private Integer sceneStatus;

    private String userEmail;

    private String userSex;

    private String avatarImg;

    private String userTel;

    private String userPhone;

    private String userQq;

    private String userQuestion;

    private String userAnswer;

    private Date userBirthday;

    private String userProvince;

    private String userCity;

    private String userArea;

    private String userAddress;

    private Date userAddtime;

    private String userAddip;

    private Date userLogintime;

    private String userLoginip;

    private Integer isSystem;

    private String depositUserid;

    private String depositUsrcustid;

    private String busiStatus;

    private String busiAuditdesc;

    private Integer isBlackList;

    private Date addBlackTime;

    private Integer originType;

    private Integer continueLoginNum;

    private Integer totalLoginNum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserPaypassword() {
        return userPaypassword;
    }

    public void setUserPaypassword(String userPaypassword) {
        this.userPaypassword = userPaypassword == null ? null : userPaypassword.trim();
    }

    public Integer getUserVouch() {
        return userVouch;
    }

    public void setUserVouch(Integer userVouch) {
        this.userVouch = userVouch;
    }

    public Integer getUserIslock() {
        return userIslock;
    }

    public void setUserIslock(Integer userIslock) {
        this.userIslock = userIslock;
    }

    public Integer getInviteUserid() {
        return inviteUserid;
    }

    public void setInviteUserid(Integer inviteUserid) {
        this.inviteUserid = inviteUserid;
    }

    public String getInviteMoney() {
        return inviteMoney;
    }

    public void setInviteMoney(String inviteMoney) {
        this.inviteMoney = inviteMoney == null ? null : inviteMoney.trim();
    }

    public Integer getCardType() {
        return cardType;
    }

    public void setCardType(Integer cardType) {
        this.cardType = cardType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber == null ? null : cardNumber.trim();
    }

    public String getCardFrontImg() {
        return cardFrontImg;
    }

    public void setCardFrontImg(String cardFrontImg) {
        this.cardFrontImg = cardFrontImg == null ? null : cardFrontImg.trim();
    }

    public String getCardBackImg() {
        return cardBackImg;
    }

    public void setCardBackImg(String cardBackImg) {
        this.cardBackImg = cardBackImg == null ? null : cardBackImg.trim();
    }

    public String getUserNation() {
        return userNation;
    }

    public void setUserNation(String userNation) {
        this.userNation = userNation == null ? null : userNation.trim();
    }

    public String getUserRealname() {
        return userRealname;
    }

    public void setUserRealname(String userRealname) {
        this.userRealname = userRealname == null ? null : userRealname.trim();
    }

    public String getUserIntegral() {
        return userIntegral;
    }

    public void setUserIntegral(String userIntegral) {
        this.userIntegral = userIntegral == null ? null : userIntegral.trim();
    }

    public Integer getAvatarStatus() {
        return avatarStatus;
    }

    public void setAvatarStatus(Integer avatarStatus) {
        this.avatarStatus = avatarStatus;
    }

    public Integer getRealnameStatus() {
        return realnameStatus;
    }

    public void setRealnameStatus(Integer realnameStatus) {
        this.realnameStatus = realnameStatus;
    }

    public Integer getEmailStatus() {
        return emailStatus;
    }

    public void setEmailStatus(Integer emailStatus) {
        this.emailStatus = emailStatus;
    }

    public Integer getPhoneStatus() {
        return phoneStatus;
    }

    public void setPhoneStatus(Integer phoneStatus) {
        this.phoneStatus = phoneStatus;
    }

    public Integer getVideoStatus() {
        return videoStatus;
    }

    public void setVideoStatus(Integer videoStatus) {
        this.videoStatus = videoStatus;
    }

    public Integer getSceneStatus() {
        return sceneStatus;
    }

    public void setSceneStatus(Integer sceneStatus) {
        this.sceneStatus = sceneStatus;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex == null ? null : userSex.trim();
    }

    public String getAvatarImg() {
        return avatarImg;
    }

    public void setAvatarImg(String avatarImg) {
        this.avatarImg = avatarImg == null ? null : avatarImg.trim();
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel == null ? null : userTel.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserQq() {
        return userQq;
    }

    public void setUserQq(String userQq) {
        this.userQq = userQq == null ? null : userQq.trim();
    }

    public String getUserQuestion() {
        return userQuestion;
    }

    public void setUserQuestion(String userQuestion) {
        this.userQuestion = userQuestion == null ? null : userQuestion.trim();
    }

    public String getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer == null ? null : userAnswer.trim();
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getUserProvince() {
        return userProvince;
    }

    public void setUserProvince(String userProvince) {
        this.userProvince = userProvince == null ? null : userProvince.trim();
    }

    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity == null ? null : userCity.trim();
    }

    public String getUserArea() {
        return userArea;
    }

    public void setUserArea(String userArea) {
        this.userArea = userArea == null ? null : userArea.trim();
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    public Date getUserAddtime() {
        return userAddtime;
    }

    public void setUserAddtime(Date userAddtime) {
        this.userAddtime = userAddtime;
    }

    public String getUserAddip() {
        return userAddip;
    }

    public void setUserAddip(String userAddip) {
        this.userAddip = userAddip == null ? null : userAddip.trim();
    }

    public Date getUserLogintime() {
        return userLogintime;
    }

    public void setUserLogintime(Date userLogintime) {
        this.userLogintime = userLogintime;
    }

    public String getUserLoginip() {
        return userLoginip;
    }

    public void setUserLoginip(String userLoginip) {
        this.userLoginip = userLoginip == null ? null : userLoginip.trim();
    }

    public Integer getIsSystem() {
        return isSystem;
    }

    public void setIsSystem(Integer isSystem) {
        this.isSystem = isSystem;
    }

    public String getDepositUserid() {
        return depositUserid;
    }

    public void setDepositUserid(String depositUserid) {
        this.depositUserid = depositUserid == null ? null : depositUserid.trim();
    }

    public String getDepositUsrcustid() {
        return depositUsrcustid;
    }

    public void setDepositUsrcustid(String depositUsrcustid) {
        this.depositUsrcustid = depositUsrcustid == null ? null : depositUsrcustid.trim();
    }

    public String getBusiStatus() {
        return busiStatus;
    }

    public void setBusiStatus(String busiStatus) {
        this.busiStatus = busiStatus == null ? null : busiStatus.trim();
    }

    public String getBusiAuditdesc() {
        return busiAuditdesc;
    }

    public void setBusiAuditdesc(String busiAuditdesc) {
        this.busiAuditdesc = busiAuditdesc == null ? null : busiAuditdesc.trim();
    }

    public Integer getIsBlackList() {
        return isBlackList;
    }

    public void setIsBlackList(Integer isBlackList) {
        this.isBlackList = isBlackList;
    }

    public Date getAddBlackTime() {
        return addBlackTime;
    }

    public void setAddBlackTime(Date addBlackTime) {
        this.addBlackTime = addBlackTime;
    }

    public Integer getOriginType() {
        return originType;
    }

    public void setOriginType(Integer originType) {
        this.originType = originType;
    }

    public Integer getContinueLoginNum() {
        return continueLoginNum;
    }

    public void setContinueLoginNum(Integer continueLoginNum) {
        this.continueLoginNum = continueLoginNum;
    }

    public Integer getTotalLoginNum() {
        return totalLoginNum;
    }

    public void setTotalLoginNum(Integer totalLoginNum) {
        this.totalLoginNum = totalLoginNum;
    }
}