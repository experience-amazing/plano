package com.experia.marketing.webmanager.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.experia.marketing.webmanager.dao.Profile;

public interface IProfile extends CrudRepository<Profile, Long> {
	List<Profile> findByAccountId(String accountId);
}
