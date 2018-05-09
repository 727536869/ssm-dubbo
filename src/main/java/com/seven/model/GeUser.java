package com.seven.model;

import java.io.Serializable;

public class GeUser implements Serializable{
    private static final long serialVersionUID = -1135888600047786957L;

	private Integer grUserid;

    private String grUsername;
    private String  pwd ;
    private String pwd1;
   
	private String grUsersex;

    private Integer grUserage;

    private Integer grUserworkage;

    private String grUserhuji;

    private String grUsernowlive;
    private String checkcode;// 图片验证码
    private Integer checkPhone;//最后输入的验证手机验证码
    
    private String grUserphone;// 手机号
    private String userPhone;//用户输入的手机号码
    
  
	private String secPhone; //最后发验证码的手机号

   
	private String grUseremail;

    private String grUsermarriage;

    private String grUserguoji;

    private String grUseroutwork;

    private String grUserpolitics;

    private String search;

	public Integer getGrUserid() {
		return grUserid;
	}

	public void setGrUserid(Integer grUserid) {
		this.grUserid = grUserid;
	}

	public String getGrUsername() {
		return grUsername;
	}

	public void setGrUsername(String grUsername) {
		this.grUsername = grUsername;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getPwd1() {
		return pwd1;
	}

	public void setPwd1(String pwd1) {
		this.pwd1 = pwd1;
	}

	public String getGrUsersex() {
		return grUsersex;
	}

	public void setGrUsersex(String grUsersex) {
		this.grUsersex = grUsersex;
	}

	public Integer getGrUserage() {
		return grUserage;
	}

	public void setGrUserage(Integer grUserage) {
		this.grUserage = grUserage;
	}

	public Integer getGrUserworkage() {
		return grUserworkage;
	}

	public void setGrUserworkage(Integer grUserworkage) {
		this.grUserworkage = grUserworkage;
	}

	public String getGrUserhuji() {
		return grUserhuji;
	}

	public void setGrUserhuji(String grUserhuji) {
		this.grUserhuji = grUserhuji;
	}

	public String getGrUsernowlive() {
		return grUsernowlive;
	}

	public void setGrUsernowlive(String grUsernowlive) {
		this.grUsernowlive = grUsernowlive;
	}

	public String getCheckcode() {
		return checkcode;
	}

	public void setCheckcode(String checkcode) {
		this.checkcode = checkcode;
	}

	
	public Integer getCheckPhone() {
		return checkPhone;
	}

	public void setCheckPhone(Integer checkPhone) {
		this.checkPhone = checkPhone;
	}

	public String getGrUserphone() {
		return grUserphone;
	}

	public void setGrUserphone(String grUserphone) {
		this.grUserphone = grUserphone;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getSecPhone() {
		return secPhone;
	}

	public void setSecPhone(String secPhone) {
		this.secPhone = secPhone;
	}

	public String getGrUseremail() {
		return grUseremail;
	}

	public void setGrUseremail(String grUseremail) {
		this.grUseremail = grUseremail;
	}

	public String getGrUsermarriage() {
		return grUsermarriage;
	}

	public void setGrUsermarriage(String grUsermarriage) {
		this.grUsermarriage = grUsermarriage;
	}

	public String getGrUserguoji() {
		return grUserguoji;
	}

	public void setGrUserguoji(String grUserguoji) {
		this.grUserguoji = grUserguoji;
	}

	public String getGrUseroutwork() {
		return grUseroutwork;
	}

	public void setGrUseroutwork(String grUseroutwork) {
		this.grUseroutwork = grUseroutwork;
	}

	public String getGrUserpolitics() {
		return grUserpolitics;
	}

	public void setGrUserpolitics(String grUserpolitics) {
		this.grUserpolitics = grUserpolitics;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	/* (non-Javadoc)    
	 * @see java.lang.Object#toString()    
	 */
	@Override
	public String toString() {
		return "GeUser [grUserid=" + grUserid + ", grUsername=" + grUsername + ", pwd=" + pwd + ", pwd1=" + pwd1
				+ ", grUsersex=" + grUsersex + ", grUserage=" + grUserage + ", grUserworkage=" + grUserworkage
				+ ", grUserhuji=" + grUserhuji + ", grUsernowlive=" + grUsernowlive + ", checkcode=" + checkcode
				+ ", checkPhone=" + checkPhone + ", grUserphone=" + grUserphone + ", userPhone=" + userPhone
				+ ", secPhone=" + secPhone + ", grUseremail=" + grUseremail + ", grUsermarriage=" + grUsermarriage
				+ ", grUserguoji=" + grUserguoji + ", grUseroutwork=" + grUseroutwork + ", grUserpolitics="
				+ grUserpolitics + ", search=" + search + "]";
	}

	
  
    
}