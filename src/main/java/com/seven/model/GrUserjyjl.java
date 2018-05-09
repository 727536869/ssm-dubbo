/** 
 * <pre>项目名称:seven-group 
 * 文件名称:GrUserjyjl.java 
 * 包名:com.seven.model 
 * 创建日期:2018年3月27日下午3:02:21 
 * Copyright (c) 2018, lxm_man@163.com All Rights Reserved.</pre> 
 */  
package com.seven.model;

/** 
 * <pre>项目名称：seven-group    
 * 类名称：GrUserjyjl    
 * 类描述：    
 * 创建人：张国彬  
 * 创建时间：2018年3月27日 下午3:02:21    
 * 修改人：张国彬    
 * 修改时间：2018年3月27日 下午3:02:21    
 * 修改备注：       
 * @version </pre>    
 */
public class GrUserjyjl {
	
	
	 private Integer eduid;//教育表的主键ID,跟用户表关联
	 private String edustadate;//就读开始时间
	 private String eduenddate;//就读结束时间
	 private String schoolname;//学校名称
	 private Integer tongzhao;//是否是统招
	 private String industryidid;//专业名称
	 private String edubacid;//学历学位
	 private String papers;//证件号码
	 
	 
	public Integer getEduid() {
		return eduid;
	}
	public void setEduid(Integer eduid) {
		this.eduid = eduid;
	}
	public String getEdustadate() {
		return edustadate;
	}
	public void setEdustadate(String edustadate) {
		this.edustadate = edustadate;
	}
	public String getEduenddate() {
		return eduenddate;
	}
	public void setEduenddate(String eduenddate) {
		this.eduenddate = eduenddate;
	}
	public String getSchoolname() {
		return schoolname;
	}
	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}
	public Integer getTongzhao() {
		return tongzhao;
	}
	public void setTongzhao(Integer tongzhao) {
		this.tongzhao = tongzhao;
	}
	public String getIndustryidid() {
		return industryidid;
	}
	public void setIndustryidid(String industryidid) {
		this.industryidid = industryidid;
	}
	public String getEdubacid() {
		return edubacid;
	}
	public void setEdubacid(String edubacid) {
		this.edubacid = edubacid;
	}
	public String getPapers() {
		return papers;
	}
	public void setPapers(String papers) {
		this.papers = papers;
	}
	@Override
	public String toString() {
		return "GrUserjyjl [eduid=" + eduid + ", edustadate=" + edustadate + ", eduenddate=" + eduenddate
				+ ", schoolname=" + schoolname + ", tongzhao=" + tongzhao + ", industryidid=" + industryidid
				+ ", edubacid=" + edubacid + ", papers=" + papers + "]";
	}
	
	
	

}
