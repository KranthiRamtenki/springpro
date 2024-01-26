package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.CustomerBo;
import com.nt.dao.ICustomerDao;
import com.nt.dto.CustomerDto;

@Service("service")
public class CustomerServiceImpl implements ICustomeService {
	
	@Autowired
	private ICustomerDao dao;
	
	public CustomerServiceImpl(ICustomerDao dao) {
		this.dao=dao;
		System.out.println(" one param constructor");
	}

	@Override
	public String caluculate_simple_interst(CustomerDto dto) throws Exception {
		// TODO Auto-generated method stub
		// to calculate the simple interst
		double intert_amount= dto.getPrincple_amount()*dto.getRate()*dto.getTime()/100;
		// to convert bo to dto
		CustomerBo bo =new CustomerBo();
		bo.setCust_name(dto.getCust_name());
		bo.setPrincple_amount(dto.getPrincple_amount());
		bo.setRate(dto.getRate());
		bo.setTime(dto.getTime());
		bo.setSimple_intrest(intert_amount);
		
		//  to call the dao method
		  int count =dao.insert(bo);
		  
		return   count==1?"Customer registered sucessfully---> SimpleIntrest amount::"+intert_amount:"Customer registration failed"; 
	}

}
