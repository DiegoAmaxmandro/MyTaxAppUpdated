package com.project.mytaxapp.mytaxapp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.mytaxapp.mytaxapp.dto.RequestMyProfile;
import com.project.mytaxapp.mytaxapp.models.AccountantsProfile;
import com.project.mytaxapp.mytaxapp.repository.ListAccountantRepository;

@Controller
@RequestMapping("accountant")
public class ProfileController {
	@Autowired
	private ListAccountantRepository listAccRepository;
	
	@GetMapping("profileForm")
	public String profile(RequestMyProfile request) {
		return "accountant/profileForm";
	}
	
	@PostMapping("myProfile")
	public String myProfile(@Valid RequestMyProfile request, BindingResult result ) {
		if(result.hasErrors()) {
			return "accountant/profileForm";
		}
		
		AccountantsProfile accProfile = request.toAccountantsProfile();
		listAccRepository.save(accProfile);
		return "accountant/dashboard";
	}

}
