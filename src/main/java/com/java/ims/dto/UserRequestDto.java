package com.java.ims.dto;

import com.java.ims.validation.MobileNumberValidation;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequestDto {
		
		@NotBlank(message = "username should not be empty or null")
		private String username;
		@NotEmpty(message = "Password should not be empty")
		private String password;
		@Column(unique = true)
		@Email(message = "Invalid EmailId")
		private String email;
//		@MobileNumberValidation
		private long mobileNo;
		

	}

