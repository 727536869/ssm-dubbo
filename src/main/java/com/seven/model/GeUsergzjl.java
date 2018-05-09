/** 
 * <pre>项目名称:seven-group 
 * 文件名称:GeUsergzjl.java 
 * 包名:com.seven.model 
 * 创建日期:2018年3月26日下午7:02:47 
 * Copyright (c) 2018, lxm_man@163.com All Rights Reserved.</pre> 
 */  
package com.seven.model;

/** 
 * <pre>项目名称：seven-group    
 * 类名称：GeUsergzjl    
 * 类描述：    
 * 创建人：张国彬  
 * 创建时间：2018年3月26日 下午7:02:47    
 * 修改人：张国彬    
 * 修改时间：2018年3月26日 下午7:02:47    
 * 修改备注：       
 * @version </pre>    
 */
public class GeUsergzjl {
	
	
	private Integer  gruserexprexpreid;//工作经历ID,跟用户ID一致
	private String companyname;//工作的企业名称
	private Integer industryid;//行业的类型
	private Integer positionid;//职位名称
	private Integer professionid;//职位类别
	private String expredateStart;//开始时间
	private String expredateEnd;//结束时间
	private Double positionSalary;//职位薪资
	private String expreDescribe;//工作描述
	private String companyType;//企业性质
	
	
	
	
	
	public Integer getGruserexprexpreid() {
		return gruserexprexpreid;
	}
	public void setGruserexprexpreid(Integer gruserexprexpreid) {
		this.gruserexprexpreid = gruserexprexpreid;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public Integer getIndustryid() {
		return industryid;
	}
	public void setIndustryid(Integer industryid) {
		this.industryid = industryid;
	}
	public Integer getPositionid() {
		return positionid;
	}
	public void setPositionid(Integer positionid) {
		this.positionid = positionid;
	}
	public Integer getProfessionid() {
		return professionid;
	}
	public void setProfessionid(Integer professionid) {
		this.professionid = professionid;
	}
	public String getExpredateStart() {
		return expredateStart;
	}
	public void setExpredateStart(String expredateStart) {
		this.expredateStart = expredateStart;
	}
	public String getExpredateEnd() {
		return expredateEnd;
	}
	public void setExpredateEnd(String expredateEnd) {
		this.expredateEnd = expredateEnd;
	}
	public Double getPositionSalary() {
		return positionSalary;
	}
	public void setPositionSalary(Double positionSalary) {
		this.positionSalary = positionSalary;
	}
	public String getExpreDescribe() {
		return expreDescribe;
	}
	public void setExpreDescribe(String expreDescribe) {
		this.expreDescribe = expreDescribe;
	}
	public String getCompanyType() {
		return companyType;
	}
	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	@Override
	public String toString() {
		return "GeUsergzjl [gruserexprexpreid=" + gruserexprexpreid + ", companyname=" + companyname + ", industryid="
				+ industryid + ", positionid=" + positionid + ", professionid=" + professionid + ", expredateStart="
				+ expredateStart + ", expredateEnd=" + expredateEnd + ", positionSalary=" + positionSalary
				+ ", expreDescribe=" + expreDescribe + ", companyType=" + companyType 
				+ "]";
	}
	
	
	
	

}
