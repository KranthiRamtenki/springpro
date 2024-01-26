package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.bo.CustomerBo;

@Repository("custDao")
public class CustomerDaoImpl implements ICustomerDao{
	
	private final String INSERT_QUETY = "INSERT INTO CUSTOMER VALUES(?,?,?,?)";
			
	
	@Autowired
	private DataSource ds;
	
     public CustomerDaoImpl(DataSource ds) {
    	 this.ds=ds;
    	 System.out.println(" one param constructor");
     }

	@Override
	public int insert(CustomerBo bo) throws Exception {
		// TODO Auto-generated method stub
		      Connection con =null;
		      PreparedStatement ps=null;
		      int rs =0;
		      
		try {
			
			// to create connection btw java application to db software by using url
			  con=ds.getConnection();
			// to create prepared statemnet obj
			  if(con!=null)
				  ps=con.prepareStatement(INSERT_QUETY);
			  // set input value to query forem
			  ps.setString(1, bo.getCust_name());
			  ps.setDouble(2, bo.getPrincple_amount());
			  ps.setInt(3, bo.getRate());
			  ps.setInt(4, bo.getTime());
			  
			  // to excute the sql query
			   rs = ps.executeUpdate();
			  
			  if(rs!=0) {
				  System.out.println("Record is inserted");
			  }
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps!=null)
					ps.close();
			}catch(SQLException se) {
				se.printStackTrace();
			}
			try {
				if(con!=null)
					con.close();
			}catch(SQLException se) {
				se.printStackTrace();
			}
		}
		return rs;
	}
	

}
