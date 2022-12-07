package com.project.mytaxapp.mytaxapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.mytaxapp.mytaxapp.models.AccountantsProfile;

@Service
public interface ProfileService {
	List < AccountantsProfile > getAllProfiles();
    void saveProfiles(AccountantsProfile accprofile);
    AccountantsProfile getProfileById(long id);
    void deleteEmployeeById(long id);

}
