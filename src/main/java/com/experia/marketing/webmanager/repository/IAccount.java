package com.experia.marketing.webmanager.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.experia.marketing.webmanager.dao.Account;

public interface IAccount extends CrudRepository<Account, Long>  {

	List<Account> findByEmail(String email);
	
}
