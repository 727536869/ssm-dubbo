/** 
 * <pre>项目名称:seven-group 
 * 文件名称:CompanyUser.java 
 * 包名:com.seven.model 
 * 创建日期:2018年3月27日下午2:20:50 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.seven.model;

/** 
 * <pre>项目名称：seven-group    
 * 类名称：CompanyUser    
 * 类描述：    
 * 创建人：JavaScript 
 * 创建时间：2018年3月27日 下午2:20:50    
 * 修改人：JavaScript  
 * 修改时间：2018年3月27日 下午2:20:50    
 * 修改备注：       
 * @version </pre>    
 */
public class CompanyUser {
	
	private Integer userid;
	private String username;
	private String userpwd;
	private String useremail;
	private String userphone;
	
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpwd() {
		return userpwd;
	}
	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public String getUserphone() {
		return userphone;
	}
	public void setUserphone(String userphone) {
		this.userphone = userphone;
	}
	@Override
	public String toString() {
		return "CompanyUser [userid=" + userid + ", username=" + username + ", userpwd=" + userpwd + ", useremail="
				+ useremail + ", userphone=" + userphone + "]";
	}
	
	
}
