package com.java.ims.service;

import com.java.ims.dto.AdminRequestDto;
import com.java.ims.dto.AdminResponseDto;

public interface AdminService {

	AdminResponseDto createAdmin(AdminRequestDto adminRequestDto);

	AdminResponseDto login(String adminEmail, String adminPassword);

	AdminResponseDto adminForgotPwd(String adminEmail, String adminPassword);

	void deleteAdmin(String adminEmail);

}
