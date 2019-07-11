package com.experia.marketing.webmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.experia.marketing.webmanager.dao.Account;

@Controller
@RequestMapping("account")
public class AccountController {

	@RequestMapping(value="/register",  produces="application/json", method=RequestMethod.POST)
	public @ResponseBody Account registerAccount(String email, String password) {
		Account account = new Account();
		account.setEmail(email);
		account.setPassword(password);
		return account;
	}
	
}
