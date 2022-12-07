//package com.project.mytaxapp.mytaxapp.controller;
//
//
//import java.util.List;
//import java.util.Optional;
//
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.project.mytaxapp.mytaxapp.dto.RequestMyProfile;
//import com.project.mytaxapp.mytaxapp.models.AccountantsProfile;
//import com.project.mytaxapp.mytaxapp.models.User;
//import com.project.mytaxapp.mytaxapp.repository.AccountantRepository;
//import com.project.mytaxapp.mytaxapp.repository.ProfileRepository;
//import com.project.mytaxapp.mytaxapp.repository.UserRepository;
//
//@Controller
//@RequestMapping("accountant")
//public class ProfileController {
//	@Autowired
//	private AccountantRepository listAccRepository;
//
//	@Autowired
//	private ProfileRepository profileRepository;
	

//	@GetMapping("myProfile/{id}")
//	public String myProfile(@PathVariable("id") long id, Model model) {
//		List<AccountantsProfile> accountants = profileRepository.findBId(id);
//		model.addAttribute("accountants", accountants);
//		return "accountant/myProfile";
//	}
//	@GetMapping("myProfile") //It's working
//	public String myProfile(Model model) {
//		List<AccountantsProfile> accountants = listAccRepository.findAll();
//		model.addAttribute("accountants", accountants);
//		return "accountant/myProfile";
//	}

//	@GetMapping("profileForm")
//	public String profile(RequestMyProfile request) {
//		return "accountant/profileForm";
//	}
//	
//	@GetMapping("updateProfile")
//	public String updateProfile(RequestMyProfile request) {
//		return "updateProfile";
//	}
//	
//	
//
//	@PostMapping("add") //It's working
//	public String addProfile(@Valid RequestMyProfile request, BindingResult result) {
//		if (result.hasErrors()) {
//			return "accountant/profileForm";
//		}
//
//		AccountantsProfile accProfile = request.toAccountantsProfile();
//		listAccRepository.save(accProfile);
//		return "accountant/dashboard";
//	}
//
//	@GetMapping("updateProfile/{id}")
//	public String updateProfileForm(@PathVariable("id") Long id, Model model, RequestMyProfile request) {
//		Optional<AccountantsProfile> accProfile = listAccRepository.findById(id);
//		model.addAttribute("accProfile", accProfile);
//		return "updateProfile";
//		
//	}
//	@PostMapping("/edit")
//	public ModelAndView edit(AccountantsProfile accountantsProfile) {
//		ModelAndView mv = new ModelAndView();
//		listAccRepository.save(accountantsProfile);
//		mv.setViewName("redirect:accountant/dashboard");
//		return mv;
//		
//	}

//	@GetMapping("delete/{id}")
//	public String deleteProfile(@PathVariable("id") long id, Model model) {
//		AccountantsProfile accProfile = profileRepository.findById(id)
//				.orElseThrow(() -> new IllegalArgumentException("Invalid student Id:" + id));
//		profileRepository.delete(accProfile);
//		model.addAttribute("accProfile", profileRepository.findAll());
//		return "redirect:/myProfile";
//	}

//}
