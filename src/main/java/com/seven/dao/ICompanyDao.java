/** 
 * <pre>项目名称:seven-group 
 * 文件名称:ICompanyDao.java 
 * 包名:com.seven.dao 
 * 创建日期:2018年3月27日下午2:19:16 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.seven.dao;

import java.util.List;

import com.seven.model.CompanyUser;

/** 
 * <pre>项目名称：seven-group    
 * 类名称：ICompanyDao    
 * 类描述：    
 * 创建人：JavaScript 
 * 创建时间：2018年3月27日 下午2:19:16    
 * 修改人：JavaScript  
 * 修改时间：2018年3月27日 下午2:19:16    
 * 修改备注：       
 * @version </pre>    
 */
public interface ICompanyDao {

	/** <pre>selectCompanyUserWhere(这里用一句话描述这个方法的作用)   
	 * 创建人：JavaScript  
	 * 创建时间：2018年3月27日 下午2:27:17    
	 * 修改人：JavaScript 
	 * 修改时间：2018年3月27日 下午2:27:17    
	 * 修改备注： 
	 * @param cu
	 * @return</pre>    
	 */
	CompanyUser selectCompanyUserWhere(CompanyUser cu);

	/** <pre>testCompanyRegisterName(这里用一句话描述这个方法的作用)   
	 * 创建人：刘文圣
	 * 创建时间：2018年3月27日 下午4:52:58    
	 * 修改人：刘文圣
	 * 修改时间：2018年3月27日 下午4:52:58    
	 * 修改备注： 
	 * @param registerName
	 * @return</pre>    
	 */
 
	
	List testCompanyRegisterName(String registerName);

	/** <pre>saveCompanyRegister(这里用一句话描述这个方法的作用)   
	 * 创建人：刘文圣
	 * 创建时间：2018年3月27日 下午4:54:36    
	 * 修改人：刘文圣
	 * 修改时间：2018年3月27日 下午4:54:36    
	 * 修改备注： 
	 * @param companyUser</pre>    
	 * @return 
	 */
	int saveCompanyRegister(CompanyUser companyUser);

}
