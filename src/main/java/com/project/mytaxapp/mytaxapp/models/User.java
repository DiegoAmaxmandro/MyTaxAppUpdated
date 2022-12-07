package com.project.mytaxapp.mytaxapp.models;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Collections;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.validator.constraints.Length;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Table(name = "users")
public class User implements UserDetails  {
    private static final long serialVersionUID = 1L;

	@SequenceGenerator(
            name = "users_sequence",
            sequenceName = "users_sequence",
            allocationSize = 1
    )
	
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "users_sequence")
    private long id;

    @NotBlank(message = "First Name cannot be empty")
    @Column(name = "first_name")
    private String firstName;

    @NotBlank(message = "Last Name cannot be empty")
    @Column(name = "last_name")
    private String lastName;

    @NotBlank(message = "Email cannot be empty")
    @Email(message = "Please enter a valid email address")
    @Column(name = "email", unique = true)
    private String email;

    @NotBlank(message = "Password cannot be empty")
    @Length(min = 7, message = "Password should be atleast 7 characters long")
    @Column(name = "password")
    private String password;

    @Column(name = "mobile", unique = true)
    @Length(min = 10, message = "Mobile number should be atleast 10 number long")
    private String mobile;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
    
    @Enumerated(EnumType.STRING)
    private Role role;

    @Column(name = "locked")
    private Boolean locked = false;

    @Column(name = "enabled")
    private Boolean enabled = true;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        SimpleGrantedAuthority authority = new SimpleGrantedAuthority(role.name());
        return Collections.singletonList(authority);
    }
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "user", fetch = FetchType.LAZY)
    private AccountantsProfile accountantsProfile;

    public AccountantsProfile getAccountantsProfile() {
		return accountantsProfile;
	}

	public void setAccountantsProfile(AccountantsProfile accountantsProfile) {
		this.accountantsProfile = accountantsProfile;
	}

	@Override
    public String getPassword() {
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return !locked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    public Role getRole() { return role; }

    public void setRole(com.project.mytaxapp.mytaxapp.models.Role role) {
        this.role = role;
    }

    public String getEmail() { 
    	
    	return email;
    }

    public void setEmail(String email) {
    	
    	this.email = email; 
    	
    }

    public String getFirstName() { 
    	
    	return firstName; 
    }

    public void setFirstName(String firstName) { 
    	
    	this.firstName = firstName;
    	
   }

    public String getMobile() {
    	return mobile;
    	
   }

    public void setMobile(String mobile) {
    	
    	this.mobile = mobile;
    	
   }

    public String getLastName() {
    	return lastName; 
    	
    }

    public void setLastName(String lastName) { 
    	
    	this.lastName = lastName; 
    	
    }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDateTime getCreatedAt() {
		
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		
		this.updatedAt = updatedAt;
	}

	public Boolean getLocked() {
		
		return locked;
	}

	public void setLocked(Boolean locked) {
		
		this.locked = locked;
	}

	public Boolean getEnabled() {
		
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		
		this.enabled = enabled;
	}
    
}
