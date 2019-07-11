package com.experia.marketing.webmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.experia.marketing.webmanager.dao.Profile;

@Controller
@RequestMapping("profile")
public class ProfileController {
	
	@RequestMapping(value="/create",  produces="application/json", method=RequestMethod.POST)
	public @ResponseBody Profile createProfile(Long accountId, String firstName, String lastName, String nickName) {
		Profile profile = new Profile();
		profile.setAccountId(accountId);
		profile.setFirstName(firstName);
		profile.setLastName(lastName);
		profile.setNickName(nickName);
		return profile;
	}

}
