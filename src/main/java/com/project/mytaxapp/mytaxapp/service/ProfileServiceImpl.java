package com.project.mytaxapp.mytaxapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.mytaxapp.mytaxapp.models.AccountantsProfile;
import com.project.mytaxapp.mytaxapp.repository.ListAccountantRepository;

@Service
public class ProfileServiceImpl implements ProfileService{
	
	@Autowired
	private ListAccountantRepository accountantRepository;

	@Override
	public List<AccountantsProfile> getAllProfiles() {
		return accountantRepository.findAll() ;
	}

	@Override
	public void saveProfiles(AccountantsProfile accprofile) {
		this.accountantRepository.save(accprofile);
		
	}

	@Override
	public AccountantsProfile getProfileById(long id) {
		Optional <AccountantsProfile> opt = accountantRepository.findById(id);
		AccountantsProfile accprofile = null;
		if (opt.isPresent()) {
			accprofile = opt.get();
		}else {
			throw new RuntimeException(" Profile not found for id : " + id);
		}
		return accprofile;
	}

	@Override
	public void deleteEmployeeById(long id) {
		this.accountantRepository.deleteById(id);
		
	}

}
