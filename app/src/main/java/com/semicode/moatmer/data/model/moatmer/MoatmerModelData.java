
package com.semicode.moatmer.data.model.moatmer;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MoatmerModelData implements Serializable
{

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("user_type")
    @Expose
    private String userType;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("email")
    @Expose
    private Object email;
    @SerializedName("phone_code")
    @Expose
    private String phoneCode;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("logo")
    @Expose
    private String logo;
    @SerializedName("umrah_price")
    @Expose
    private Integer umrahPrice;
    @SerializedName("birth_date")
    @Expose
    private String birthDate;
    @SerializedName("card_id")
    @Expose
    private String cardId;
    @SerializedName("contact_number")
    @Expose
    private Object contactNumber;
    @SerializedName("whatsapp_number")
    @Expose
    private Object whatsappNumber;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("balance")
    @Expose
    private Integer balance;
    @SerializedName("is_available")
    @Expose
    private String isAvailable;
    @SerializedName("is_confirmed")
    @Expose
    private String isConfirmed;
    @SerializedName("is_block")
    @Expose
    private String isBlock;
    @SerializedName("is_login")
    @Expose
    private String isLogin;
    @SerializedName("logout_time")
    @Expose
    private Object logoutTime;
    @SerializedName("software_type")
    @Expose
    private String softwareType;
    @SerializedName("banner")
    @Expose
    private Object banner;
    @SerializedName("email_verified_at")
    @Expose
    private Object emailVerifiedAt;
    @SerializedName("deleted_at")
    @Expose
    private Object deletedAt;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("finished_umrahs_count")
    @Expose
    private Integer finishedUmrahsCount;
    @SerializedName("age")
    @Expose
    private Integer age;
    @SerializedName("rating")
    @Expose
    private Integer rating;
    private final static long serialVersionUID = 8159475431101730075L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getEmail() {
        return email;
    }

    public void setEmail(Object email) {
        this.email = email;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Integer getUmrahPrice() {
        return umrahPrice;
    }

    public void setUmrahPrice(Integer umrahPrice) {
        this.umrahPrice = umrahPrice;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public Object getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(Object contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Object getWhatsappNumber() {
        return whatsappNumber;
    }

    public void setWhatsappNumber(Object whatsappNumber) {
        this.whatsappNumber = whatsappNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public String getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(String isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String getIsConfirmed() {
        return isConfirmed;
    }

    public void setIsConfirmed(String isConfirmed) {
        this.isConfirmed = isConfirmed;
    }

    public String getIsBlock() {
        return isBlock;
    }

    public void setIsBlock(String isBlock) {
        this.isBlock = isBlock;
    }

    public String getIsLogin() {
        return isLogin;
    }

    public void setIsLogin(String isLogin) {
        this.isLogin = isLogin;
    }

    public Object getLogoutTime() {
        return logoutTime;
    }

    public void setLogoutTime(Object logoutTime) {
        this.logoutTime = logoutTime;
    }

    public String getSoftwareType() {
        return softwareType;
    }

    public void setSoftwareType(String softwareType) {
        this.softwareType = softwareType;
    }

    public Object getBanner() {
        return banner;
    }

    public void setBanner(Object banner) {
        this.banner = banner;
    }

    public Object getEmailVerifiedAt() {
        return emailVerifiedAt;
    }

    public void setEmailVerifiedAt(Object emailVerifiedAt) {
        this.emailVerifiedAt = emailVerifiedAt;
    }

    public Object getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Object deletedAt) {
        this.deletedAt = deletedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getFinishedUmrahsCount() {
        return finishedUmrahsCount;
    }

    public void setFinishedUmrahsCount(Integer finishedUmrahsCount) {
        this.finishedUmrahsCount = finishedUmrahsCount;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

}
