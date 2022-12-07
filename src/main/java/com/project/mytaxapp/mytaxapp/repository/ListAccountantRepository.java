package com.project.mytaxapp.mytaxapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.mytaxapp.mytaxapp.models.AccountantsProfile;


@Repository
public interface ListAccountantRepository extends JpaRepository<AccountantsProfile, Long>{
	
	
	


}
