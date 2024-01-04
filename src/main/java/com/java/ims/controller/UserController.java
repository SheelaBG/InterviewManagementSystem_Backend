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

import com.java.ims.dto.UserRequestDto;
import com.java.ims.dto.UserResponseDto;
import com.java.ims.service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userservice;

	@PostMapping("/signup")
	public ResponseEntity<UserResponseDto> userRegister(@RequestBody UserRequestDto userDto) {
		UserResponseDto newUser = userservice.createUser(userDto);
		return ResponseEntity.status(HttpStatus.OK).body(newUser);

	}

	@GetMapping("/login")
	public ResponseEntity<UserResponseDto> userLogin(@RequestHeader String email, @RequestHeader String password) {
		UserResponseDto userResponseDto = userservice.login(email, password);
		return ResponseEntity.status(HttpStatus.OK).body(userResponseDto);

	}

	@PutMapping("/forgot")
	public ResponseEntity<UserResponseDto> userForgotPwd(@RequestHeader String email, @RequestHeader String password) {
		UserResponseDto userResponseDto = userservice.ForgotPwd(email, password);
		return ResponseEntity.status(HttpStatus.OK).body(userResponseDto);

	}

	@DeleteMapping("/delete")
	public void deleteUser(@RequestHeader String email) {
		userservice.delete(email);

	}

}
