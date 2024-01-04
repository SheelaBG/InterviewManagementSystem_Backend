package com.java.ims.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApplicantRequestDto {

	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private String gender;
	private String degree;
	private int passoutYear;
	private int percentage;
	private String experience;
	private String email;
	private long mobileNo;
	
}
