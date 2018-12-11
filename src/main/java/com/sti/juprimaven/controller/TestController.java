package com.sti.juprimaven.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sti.juprimaven.dao.CustomerDao;
import com.sti.juprimaven.model.Customer;
@RestController
@RequestMapping("/terserah")
public class TestController {
	
	@Autowired
	private CustomerDao customerDao;
	
	@GetMapping("/hello")
	public String hello(@RequestParam(value="id", defaultValue="") String id ) {
		try {
			Customer customer = customerDao.getById(Integer.valueOf(id));
			if (customer == null) {
				return "data tidak ditemukan";
			} else {
				return "hello"+customer.getFirstName();
			}
		} catch (NumberFormatException e) {
			return "salah format input";
		} catch (Exception e) {
			return String.format("terjadi kesalahan system : %s", e.getMessage());
		}
		
	}

}
