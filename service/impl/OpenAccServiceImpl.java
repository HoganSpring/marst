package com.creditcore.ledger.openacc.service.impl;

import org.springframework.stereotype.Service;

import com.creditcore.ledger.openacc.service.OpenAccService;

/**
* @Title: initService.java 
* @Package com.creditcore.ledger.issue.init.services 
* @Description: TODO 
* @author xiubb
* @date 2017年8月15日 下午2:56:44 
* @version V0.0.1
*    
*/
@Service("openAccService")
public class OpenAccServiceImpl implements OpenAccService  {
	
	public void hello(String in) throws Exception{
		System.out.println("ConsSyncService say hello!! begin action contractno=" + in);
		//业务逻辑
		System.out.println("ConsSyncService say hello!! end action contractno=" + in);
	};
}
