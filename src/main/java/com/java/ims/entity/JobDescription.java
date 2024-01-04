package com.java.ims.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="JD")
public class JobDescription {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int jdId;
	private String role;
	private String jobBrief;
	private String exp;
	private String skills;
	
	
}
