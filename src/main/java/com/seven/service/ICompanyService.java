/** 
 * <pre>项目名称:seven-group 
 * 文件名称:ICompanyService.java 
 * 包名:com.seven.service 
 * 创建日期:2018年3月27日下午2:17:54 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.seven.service;

import javax.servlet.http.HttpServletRequest;

import com.seven.model.CompanyUser;

/** 
 * <pre>项目名称：seven-group    
 * 类名称：ICompanyService    
 * 类描述：    
 * 创建人：JavaScript 
 * 创建时间：2018年3月27日 下午2:17:54    
 * 修改人：JavaScript  
 * 修改时间：2018年3月27日 下午2:17:54    
 * 修改备注：       
 * @version </pre>    
 */
public interface ICompanyService {

	/** <pre>CompanyRegisterValidate(这里用一句话描述这个方法的作用)   
	 * 创建人：JavaScript  
	 * 创建时间：2018年3月27日 下午2:24:50    
	 * 修改人：JavaScript 
	 * 修改时间：2018年3月27日 下午2:24:50    
	 * 修改备注： 
	 * @param cu
	 * @param request
	 * @return</pre>    
	 */
	Object CompanyRegisterValidate(CompanyUser cu, HttpServletRequest request);

	/** <pre>saveCompanyRegister(这里用一句话描述这个方法的作用)   
	 * 创建人：刘文圣
	 * 创建时间：2018年3月27日 下午4:49:01    
	 * 修改人：刘文圣
	 * 修改时间：2018年3月27日 下午4:49:01    
	 * 修改备注： 
	 * @param companyUser</pre>    
	 */
	Object saveCompanyRegister(CompanyUser companyUser);

	/** <pre>testCompanyRegisterName(这里用一句话描述这个方法的作用)   
	 * 创建人：刘文圣
	 * 创建时间：2018年3月27日 下午4:49:05    
	 * 修改人：刘文圣
	 * 修改时间：2018年3月27日 下午4:49:05    
	 * 修改备注： 
	 * @param registerName
	 * @return</pre>    
	 */
	Object testCompanyRegisterName(String registerName);

}
