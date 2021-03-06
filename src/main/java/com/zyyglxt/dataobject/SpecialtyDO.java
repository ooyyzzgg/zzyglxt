package com.zyyglxt.dataobject;

import java.util.Date;

public class SpecialtyDO extends SpecialtyDOKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_culpro_specialty.SPECIALTY_NAME
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    private String specialtyName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_culpro_specialty.SPECIALTY_PHONE
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    private String specialtyPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_culpro_specialty.SPECIALTY_ADDRESS_PRO
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    private String specialtyAddressPro;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_culpro_specialty.SPECIALTY_ADDRESS_CITY
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    private String specialtyAddressCity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_culpro_specialty.SPECIALTY_ADDRESS_COUNTY
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    private String specialtyAddressCounty;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_culpro_specialty.SPECIALTY_ADDRESS
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    private String specialtyAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_culpro_specialty.SPECIALTY_LINK
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    private String specialtyLink;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_culpro_specialty.SPECIALTY_STATUS
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    private String specialtyStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_culpro_specialty.CREATER
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    private String creater;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_culpro_specialty.itemCreateAt
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    private Date itemcreateat;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_culpro_specialty.UPDATER
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    private String updater;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_culpro_specialty.itemUpdateAt
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    private Date itemupdateat;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_culpro_specialty.SPECIALTY_DESCRIBE
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    private String specialtyDescribe;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_culpro_specialty.SPECIALTY_NAME
     *
     * @return the value of tb_culpro_specialty.SPECIALTY_NAME
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public String getSpecialtyName() {
        return specialtyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_culpro_specialty.SPECIALTY_NAME
     *
     * @param specialtyName the value for tb_culpro_specialty.SPECIALTY_NAME
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public void setSpecialtyName(String specialtyName) {
        this.specialtyName = specialtyName == null ? null : specialtyName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_culpro_specialty.SPECIALTY_PHONE
     *
     * @return the value of tb_culpro_specialty.SPECIALTY_PHONE
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public String getSpecialtyPhone() {
        return specialtyPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_culpro_specialty.SPECIALTY_PHONE
     *
     * @param specialtyPhone the value for tb_culpro_specialty.SPECIALTY_PHONE
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public void setSpecialtyPhone(String specialtyPhone) {
        this.specialtyPhone = specialtyPhone == null ? null : specialtyPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_culpro_specialty.SPECIALTY_ADDRESS_PRO
     *
     * @return the value of tb_culpro_specialty.SPECIALTY_ADDRESS_PRO
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public String getSpecialtyAddressPro() {
        return specialtyAddressPro;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_culpro_specialty.SPECIALTY_ADDRESS_PRO
     *
     * @param specialtyAddressPro the value for tb_culpro_specialty.SPECIALTY_ADDRESS_PRO
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public void setSpecialtyAddressPro(String specialtyAddressPro) {
        this.specialtyAddressPro = specialtyAddressPro == null ? null : specialtyAddressPro.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_culpro_specialty.SPECIALTY_ADDRESS_CITY
     *
     * @return the value of tb_culpro_specialty.SPECIALTY_ADDRESS_CITY
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public String getSpecialtyAddressCity() {
        return specialtyAddressCity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_culpro_specialty.SPECIALTY_ADDRESS_CITY
     *
     * @param specialtyAddressCity the value for tb_culpro_specialty.SPECIALTY_ADDRESS_CITY
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public void setSpecialtyAddressCity(String specialtyAddressCity) {
        this.specialtyAddressCity = specialtyAddressCity == null ? null : specialtyAddressCity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_culpro_specialty.SPECIALTY_ADDRESS_COUNTY
     *
     * @return the value of tb_culpro_specialty.SPECIALTY_ADDRESS_COUNTY
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public String getSpecialtyAddressCounty() {
        return specialtyAddressCounty;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_culpro_specialty.SPECIALTY_ADDRESS_COUNTY
     *
     * @param specialtyAddressCounty the value for tb_culpro_specialty.SPECIALTY_ADDRESS_COUNTY
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public void setSpecialtyAddressCounty(String specialtyAddressCounty) {
        this.specialtyAddressCounty = specialtyAddressCounty == null ? null : specialtyAddressCounty.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_culpro_specialty.SPECIALTY_ADDRESS
     *
     * @return the value of tb_culpro_specialty.SPECIALTY_ADDRESS
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public String getSpecialtyAddress() {
        return specialtyAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_culpro_specialty.SPECIALTY_ADDRESS
     *
     * @param specialtyAddress the value for tb_culpro_specialty.SPECIALTY_ADDRESS
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public void setSpecialtyAddress(String specialtyAddress) {
        this.specialtyAddress = specialtyAddress == null ? null : specialtyAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_culpro_specialty.SPECIALTY_LINK
     *
     * @return the value of tb_culpro_specialty.SPECIALTY_LINK
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public String getSpecialtyLink() {
        return specialtyLink;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_culpro_specialty.SPECIALTY_LINK
     *
     * @param specialtyLink the value for tb_culpro_specialty.SPECIALTY_LINK
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public void setSpecialtyLink(String specialtyLink) {
        this.specialtyLink = specialtyLink == null ? null : specialtyLink.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_culpro_specialty.SPECIALTY_STATUS
     *
     * @return the value of tb_culpro_specialty.SPECIALTY_STATUS
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public String getSpecialtyStatus() {
        return specialtyStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_culpro_specialty.SPECIALTY_STATUS
     *
     * @param specialtyStatus the value for tb_culpro_specialty.SPECIALTY_STATUS
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public void setSpecialtyStatus(String specialtyStatus) {
        this.specialtyStatus = specialtyStatus == null ? null : specialtyStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_culpro_specialty.CREATER
     *
     * @return the value of tb_culpro_specialty.CREATER
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public String getCreater() {
        return creater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_culpro_specialty.CREATER
     *
     * @param creater the value for tb_culpro_specialty.CREATER
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_culpro_specialty.itemCreateAt
     *
     * @return the value of tb_culpro_specialty.itemCreateAt
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public Date getItemcreateat() {
        return itemcreateat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_culpro_specialty.itemCreateAt
     *
     * @param itemcreateat the value for tb_culpro_specialty.itemCreateAt
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public void setItemcreateat(Date itemcreateat) {
        this.itemcreateat = itemcreateat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_culpro_specialty.UPDATER
     *
     * @return the value of tb_culpro_specialty.UPDATER
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public String getUpdater() {
        return updater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_culpro_specialty.UPDATER
     *
     * @param updater the value for tb_culpro_specialty.UPDATER
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public void setUpdater(String updater) {
        this.updater = updater == null ? null : updater.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_culpro_specialty.itemUpdateAt
     *
     * @return the value of tb_culpro_specialty.itemUpdateAt
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public Date getItemupdateat() {
        return itemupdateat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_culpro_specialty.itemUpdateAt
     *
     * @param itemupdateat the value for tb_culpro_specialty.itemUpdateAt
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public void setItemupdateat(Date itemupdateat) {
        this.itemupdateat = itemupdateat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_culpro_specialty.SPECIALTY_DESCRIBE
     *
     * @return the value of tb_culpro_specialty.SPECIALTY_DESCRIBE
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public String getSpecialtyDescribe() {
        return specialtyDescribe;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_culpro_specialty.SPECIALTY_DESCRIBE
     *
     * @param specialtyDescribe the value for tb_culpro_specialty.SPECIALTY_DESCRIBE
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public void setSpecialtyDescribe(String specialtyDescribe) {
        this.specialtyDescribe = specialtyDescribe == null ? null : specialtyDescribe.trim();
    }
}