package com.java.ims.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminResponseDto {

	private String adminName;
	private String adminEmail;
	private String adminPassword;
}
