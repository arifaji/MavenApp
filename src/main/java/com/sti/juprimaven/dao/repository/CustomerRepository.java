package com.sti.juprimaven.dao.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.sti.juprimaven.model.Customer;


public interface CustomerRepository extends PagingAndSortingRepository<Customer, Integer> {

}
