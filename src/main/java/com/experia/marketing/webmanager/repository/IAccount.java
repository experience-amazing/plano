package com.experia.marketing.webmanager.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.experia.marketing.webmanager.dao.Account;

@Repository
public interface IAccount extends CrudRepository<Account, Long>  {

	List<Account> findByEmail(String email);
	
}
