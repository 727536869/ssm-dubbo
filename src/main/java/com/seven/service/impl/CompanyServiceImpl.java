/** 
 * <pre>项目名称:seven-group 
 * 文件名称:CompanyServiceImpl.java 
 * 包名:com.seven.service.impl 
 * 创建日期:2018年3月27日下午2:18:26 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.seven.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.seven.dao.ICompanyDao;
import com.seven.model.CompanyUser;
import com.seven.service.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/** 
 * <pre>项目名称：seven-group    
 * 类名称：CompanyServiceImpl    
 * 类描述：    
 * 创建人：JavaScript 
 * 创建时间：2018年3月27日 下午2:18:26    
 * 修改人：JavaScript  
 * 修改时间：2018年3月27日 下午2:18:26    
 * 修改备注：       
 * @version </pre>    
 */
@Service("companyService")
public class CompanyServiceImpl implements ICompanyService {
	
	@Autowired
	private ICompanyDao companyDao;


	public Object CompanyRegisterValidate(CompanyUser cu, HttpServletRequest request) {
		JSONObject json = new JSONObject();
		if(cu.getUsername() != null & cu.getUserpwd() !=null){
			CompanyUser comu = companyDao.selectCompanyUserWhere(cu);
			if(comu != null ){
				request.getSession().setAttribute("companyuser", cu.getUserid());
				json.put("info", "登录成功");
				return json; 
			}
		}
		
		json.put("info", "用户名或密码错误");
		return json;
	}
	public Object testCompanyRegisterName(String registerName) {
		String str ="";//registerName != null && registerName != ""
		if(registerName != null && registerName != ""){
			List list = companyDao.testCompanyRegisterName(registerName);
			if(list.size() != 0){
				str ="用户已存在";
			}else{
				str ="用户可用";
			}
		}else{
			str ="用户名不可为空";
		}
		return str;
	}

	public Object saveCompanyRegister(CompanyUser companyUser) {
/*		String md5 = MD5.md5(companyUser.getUserpwd());
		companyUser.setUserpwd(md5);*/
		JSONObject json = new JSONObject();
		
		int i= companyDao.saveCompanyRegister(companyUser);
		if(i != 0){
			json.put("info", "注册成功,请重新登录");
			
		}
		return json;
	}
	
}
