package com.java.ims.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class JdRequestDto {
	
	private String role;
	private String jobBrief;
	private String exp;
	private String skills;
}
