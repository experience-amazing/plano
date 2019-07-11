package com.experia.marketing.webmanager.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.experia.marketing.webmanager.dao.Profile;
import com.experia.marketing.webmanager.repository.IProfile;

@Service
public class ProfileService {

	@Autowired
    private IProfile profileRepository;

		public Profile add(Profile profile) {
			Profile newProfile = profileRepository.save(profile);
			return newProfile;
		}
	
	   public List<Profile> findAll() {
	        Iterable<Profile> it = profileRepository.findAll();
	        ArrayList<Profile> items = new ArrayList<Profile>();
	        it.forEach(e -> items.add(e));
	        return items;
	    }	
	   
	   public void deleteById(Profile profile) {
		   profileRepository.deleteById(profile.getId());
	   }	
}
