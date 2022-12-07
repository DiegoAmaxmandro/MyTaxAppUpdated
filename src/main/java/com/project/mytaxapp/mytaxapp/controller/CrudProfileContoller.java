package com.project.mytaxapp.mytaxapp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.mytaxapp.mytaxapp.dto.RequestMyProfile;
import com.project.mytaxapp.mytaxapp.models.AccountantsProfile;
import com.project.mytaxapp.mytaxapp.service.ProfileService;

@Controller
@RequestMapping("accountant")
public class CrudProfileContoller {
	
	@Autowired
	private ProfileService  profileService;
	
	@GetMapping("myProfile")
	public String myProfile(Model model, RequestMyProfile request) {
		model.addAttribute("accountants", profileService.getAllProfiles());
		return "accountant/myProfile";
	}
	
	@GetMapping("profileForm")
	public String addProfile(Model model) {
		AccountantsProfile accProfile = new AccountantsProfile();
		model.addAttribute("accProfile", accProfile);
		return "accountant/profileForm";
	}
	
	@PostMapping("saveProfile")
	public String saveProfile(@Valid @ModelAttribute("accountantsProfile") AccountantsProfile accProfile, BindingResult result) {
		if (result.hasErrors()) {
			return "accountant/profileForm";
		}
		profileService.saveProfiles(accProfile);
		return "redirect:/accountant/myProfile";
	}
	
	@GetMapping("updateProfile/{id}")
	public String updateProfile(@PathVariable(value = "id") long id, Model model) {
		AccountantsProfile accProfile = profileService.getProfileById(id);
		model.addAttribute("accProfile", accProfile);
		return "accountant/updateProfile";
	}
	
	@PostMapping("saveUpdateProfile")
	public String saveUpdateProfile(@Valid @ModelAttribute("accountantsProfile") AccountantsProfile accProfile, BindingResult result) {
		if (result.hasErrors()) {
			return "accountant/profileForm";
		}
		profileService.saveProfiles(accProfile);
		return "redirect:/accountant/myProfile";
	}
	
	
	 @GetMapping("deleteProfile/{id}")
	 public String deleteProfile(@PathVariable(value = "id") Long id) {
		 this.profileService.deleteEmployeeById(id);
		 return "redirect:/accountant/myProfile";
	 }
	    
	
}
