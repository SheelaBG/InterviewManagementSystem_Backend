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
@Table(name="USER")
public class User {
	
			@Id
			@GeneratedValue(strategy = GenerationType.IDENTITY)
			private int uid;
			private String username;
			private String password;
			private String email;
			private long mobileNo;
		
}
