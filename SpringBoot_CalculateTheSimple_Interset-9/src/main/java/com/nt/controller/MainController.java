package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.dto.CustomerDto;
import com.nt.service.ICustomeService;
import com.nt.vo.CustomerVo;

@Controller("cont")
public class MainController {

@Autowired
 private ICustomeService iservice;

   public MainController(ICustomeService iservice) {
	   this.iservice=iservice;
	   System.out.println(" one param constructor");
   }
	
	public String process(CustomerVo vo) throws Exception {
		// convert vo to dto 
		CustomerDto dto = new CustomerDto();
		  dto.setCust_name(vo.getCust_name());
		  dto.setPrincple_amount(vo.getPrincple_amount());
		  dto.setRate(vo.getRate());
		  dto.setTime(vo.getTime());
		  
		      String result =iservice.caluculate_simple_interst(dto);
		  
		return result;
		
	}
	

}
