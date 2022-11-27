package com.project.mytaxapp.mytaxapp.dto;



import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

import com.project.mytaxapp.mytaxapp.models.AccountantsProfile;

public class RequestMyProfile {
	@NotBlank(message = "Name cannot be empty")
	private String name;
	@NotBlank(message = "Last Name cannot be empty")
	private String lastName;
	@NotBlank(message = "Email cannot be empty")
	private String email;
	@NotBlank(message = "City cannot be empty")
	private String city;
	@Length(min = 10, message = "Phone should be atleast 10 number long")
	private String phone;
	@NotBlank(message = "Specialty cannot be empty")
	private String specialty;
	@NotBlank(message = "Language cannot be empty")
	private String language;
	private String picture;
	private String price;
	@NotBlank(message = "About you cannot be empty")
	private String aboutYou;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSpecialty() {
		return specialty;
	}
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getAboutYou() {
		return aboutYou;
	}
	public void setAboutYou(String aboutYou) {
		this.aboutYou = aboutYou;
	}
	public AccountantsProfile toAccountantsProfile() {
		AccountantsProfile accountantsProfile = new AccountantsProfile();
		accountantsProfile.setName(name);
		accountantsProfile.setLastName(lastName);
		accountantsProfile.setEmail(email);
		accountantsProfile.setCity(city);
		accountantsProfile.setPhone(phone);
		accountantsProfile.setSpecialty(specialty);
		accountantsProfile.setLanguage(language);
		accountantsProfile.setPicture(picture);
		accountantsProfile.setPrice(price);
		accountantsProfile.setAboutYou(aboutYou);
		return accountantsProfile;
		
	}
	
	
}
