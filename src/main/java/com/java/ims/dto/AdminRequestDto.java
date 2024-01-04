package com.java.ims.dto;

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
public class AdminRequestDto {
	
	@NotBlank(message = "username should not be empty or null")
	private String adminName;
	@Column(unique = true)
	@Email(message = "Invalid EmailId")
	private String adminEmail;
	@NotEmpty(message = "Password should not be empty")
	private String adminPassword;
}
