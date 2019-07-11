package com.experia.marketing.webmanager.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.experia.marketing.webmanager.dao.Profile;

@Repository
public interface IProfile extends CrudRepository<Profile, Long> {
	List<Profile> findByAccountId(String accountId);
}
