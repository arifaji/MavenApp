package com.sti.juprimaven;

import java.util.List;


public class CustomerDummyDaoImpl implements CustomerDao {
	
	public void insert(Customer customer)  throws Exception{
		CustomerDataHelper.getInstance().insert(customer);
	}

	public void update(Customer customer)  throws Exception{
		CustomerDataHelper.getInstance().update(customer);
	}

	public void delete(int id)  throws Exception{
		CustomerDataHelper.getInstance().delete(id);
	}

	public List<Customer> getList()  throws Exception{
		return CustomerDataHelper.getInstance().getAllData();
	}

}
