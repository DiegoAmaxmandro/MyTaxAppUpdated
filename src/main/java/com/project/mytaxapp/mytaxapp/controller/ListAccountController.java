package com.project.mytaxapp.mytaxapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.mytaxapp.mytaxapp.models.AccountantsProfile;
import com.project.mytaxapp.mytaxapp.repository.ListAccountantRepository;

@Controller
@RequestMapping("user")
public class ListAccountController {
	
	@Autowired
	private ListAccountantRepository listrepository;
	
	
	@GetMapping("listaccount")
	public String findAccountant(Model model) {
		List<AccountantsProfile> accountants = listrepository.findAll();
		model.addAttribute("accountants", accountants);
		
		return "user/listaccount";
	}

}
