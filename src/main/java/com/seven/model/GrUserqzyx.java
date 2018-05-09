/** 
 * <pre>项目名称:seven-group 
 * 文件名称:GrUserqzyx.java 
 * 包名:com.seven.model 
 * 创建日期:2018年3月27日下午3:12:18 
 * Copyright (c) 2018, lxm_man@163.com All Rights Reserved.</pre> 
 */  
package com.seven.model;

/** 
 * <pre>项目名称：seven-group    
 * 类名称：GrUserqzyx    
 * 类描述：求职意向表    
 * 创建人：张国彬  
 * 创建时间：2018年3月27日 下午3:12:18    
 * 修改人：张国彬    
 * 修改时间：2018年3月27日 下午3:12:18    
 * 修改备注：       
 * @version </pre>    
 */
public class GrUserqzyx {
	
	
	private Integer  appraiseid;//求职意向表主键ID,跟用户表关联
	private String worktypeid;//期望的工作性质
	private String site;//期望工作的地点
	private String profession;//期望从事的职业
	private String industry;//期望工作的行业
	private double pay;//期望工资
	private String state;//目前的工作状态
	
	
	public Integer getAppraiseid() {
		return appraiseid;
	}
	public void setAppraiseid(Integer appraiseid) {
		this.appraiseid = appraiseid;
	}
	public String getWorktypeid() {
		return worktypeid;
	}
	public void setWorktypeid(String worktypeid) {
		this.worktypeid = worktypeid;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	
	public double getPay() {
		return pay;
	}
	public void setPay(double pay) {
		this.pay = pay;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "GrUserqzyx [appraiseid=" + appraiseid + ", worktypeid=" + worktypeid + ", site=" + site
				+ ", profession=" + profession + ", industry=" + industry + ", pay=" + pay + ", state=" + state + "]";
	}
	
	
	
}