package com.sti.juprimaven;

import java.util.List;

public interface CustomerDao {
	void insert(Customer customer) throws Exception;
	void update(Customer customer) throws Exception;
	void delete(int id) throws Exception;
	List<Customer> getList() throws Exception;
}
