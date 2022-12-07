package com.project.mytaxapp.mytaxapp.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "accountants")
public class AccountantsProfile {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Name cannot be empty")
	@Column(name = "name")
	private String name;
	
	@NotBlank(message = "Last Name cannot be empty")
	@Column(name = "last_name")
	private String lastName;
	
	@NotBlank(message = "Email cannot be empty")
	@Email(message = "Please enter a valid email address")
	@Column(name = "email")
	private String email;
	
	@NotBlank(message = "City cannot be empty")
	private String city;
	
	@Column(name = "phone", unique = true)
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
	
	 @OneToOne(fetch = FetchType.LAZY)
	 private User user;
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

}
