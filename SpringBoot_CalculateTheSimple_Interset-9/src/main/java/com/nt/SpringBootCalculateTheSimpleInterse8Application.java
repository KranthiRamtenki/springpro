package com.nt;

import java.io.Closeable;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.controller.MainController;
import com.nt.vo.CustomerVo;

@SpringBootApplication
public class SpringBootCalculateTheSimpleInterse8Application {
     
	 public static void main(String[] args) throws Exception {
	
		Scanner sc =new Scanner(System.in);
		 System.out.println("Enter the name");
		 String name =sc.next();
		 System.out.println("Enter the total amount");
		 double total =sc.nextDouble();
		 System.out.println("Enter the rate of interst");
		 int rate =sc.nextInt();
		 System.out.println("Enter the year");
		 int time =sc.nextInt();
		 
		 CustomerVo  vo =new CustomerVo();
		  
		   vo.setCust_name(name);
		   vo.setPrincple_amount(total);
		   vo.setRate(rate);
		   vo.setTime(time);
		 
		ApplicationContext ctx	=SpringApplication.run(SpringBootCalculateTheSimpleInterse8Application.class, args);
	
		MainController controller =ctx.getBean("cont",MainController.class);
		 
		// assign the method
		
		 String result   =controller.process(vo);
	     
		  System.out.println(result);
		  System.out.println("yml file");
		  ((ConfigurableApplicationContext) ctx).close();
	 
	 }

}
