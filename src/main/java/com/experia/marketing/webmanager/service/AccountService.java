package com.experia.marketing.webmanager.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.experia.marketing.webmanager.dao.Account;
import com.experia.marketing.webmanager.repository.IAccount;

@Service
public class AccountService {

	@Autowired
    private IAccount accountRepository;

		public Account add(Account account) {
			Account newAccount = accountRepository.save(account);
			return newAccount;
		}
	
	   public List<Account> findAll() {
	        Iterable<Account> it = accountRepository.findAll();
	        ArrayList<Account> accounts = new ArrayList<Account>();
	        it.forEach(e -> accounts.add(e));
	        return accounts;
	    }	
	   
	   public void deleteById(Account account) {
		   accountRepository.deleteById(account.getId());
	   }
}
