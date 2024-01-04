package com.java.ims.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="APPLICANT")
public class Applicant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int applid;
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
