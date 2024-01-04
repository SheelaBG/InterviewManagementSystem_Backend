package com.java.ims.service;



import com.java.ims.dto.ApplicantResponseDto;
import com.java.ims.dto.UserRequestDto;
import com.java.ims.dto.UserResponseDto;


public interface UserService {

	UserResponseDto createUser(UserRequestDto userDto);

	UserResponseDto login(String email, String password);

	UserResponseDto ForgotPwd(String email, String password);

	void delete(String email);


}

