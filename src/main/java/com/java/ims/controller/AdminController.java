package com.java.ims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.ims.dto.AdminRequestDto;
import com.java.ims.dto.AdminResponseDto;
import com.java.ims.dto.UserResponseDto;
import com.java.ims.service.AdminService;

@RestController
@CrossOrigin
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private AdminService adminService;

	@PostMapping("/signup")
	public ResponseEntity<AdminResponseDto> adminRegister(@RequestBody AdminRequestDto adminRequestDto) {
		AdminResponseDto newAdmin = adminService.createAdmin(adminRequestDto);
		return ResponseEntity.status(HttpStatus.OK).body(newAdmin);

	}

	@GetMapping("/login")
	public ResponseEntity<AdminResponseDto> adminLogin(@RequestHeader String adminEmail,
			@RequestHeader String adminPassword) {
		AdminResponseDto adminResponseDto = adminService.login(adminEmail, adminPassword);
		return ResponseEntity.status(HttpStatus.OK).body(adminResponseDto);

	}

	@PutMapping("/forgot")
	public ResponseEntity<AdminResponseDto> adminForgotPwd(@RequestHeader String adminEmail,
			@RequestHeader String adminPassword) {
		AdminResponseDto adminResponseDto = adminService.adminForgotPwd(adminEmail, adminPassword);
		return ResponseEntity.status(HttpStatus.OK).body(adminResponseDto);

	}
	
	@DeleteMapping("/delete")
	public void deleteUser(@RequestHeader String adminEmail ){
		adminService.deleteAdmin(adminEmail);	
	}
	
}
