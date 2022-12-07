package com.project.mytaxapp.mytaxapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.project.mytaxapp.mytaxapp.models.AccountantsProfile;

public interface ProfileRepository extends CrudRepository <AccountantsProfile, Long> {
	
	List<AccountantsProfile> findByName(String name);
	
	@Query("select a from AccountantsProfile a join a.user u where u.id = :id")
	List<AccountantsProfile> findBId(@Param("id")Long id);
}
