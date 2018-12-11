package com.sti.juprimaven.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sti.juprimaven.dao.CustomerDao;
import com.sti.juprimaven.dao.impl.CustomerDaoImpl;

@Configuration
public class DaoSpringConfig {
	
	@Bean
	public CustomerDao customerDao() {
		return new CustomerDaoImpl();
	}

}
