package com.java.ims.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.ims.dto.AdminRequestDto;
import com.java.ims.dto.AdminResponseDto;
import com.java.ims.entity.Admin;
import com.java.ims.exception.AdminNotFoundException;
import com.java.ims.repository.AdminRepository;
import com.java.ims.service.AdminService;
import com.java.ims.utils.AppUtils;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepository adminRepo;

	@Override
	public AdminResponseDto createAdmin(AdminRequestDto adminRequestDto) {
		Admin admin = AppUtils.mapDtoToAdmin(adminRequestDto);
		System.out.println(admin);
		String email="admin@gmail.com";
		String pwd="admin@1234";
		Admin a = null;
		if(admin.getAdminEmail().equals(email)&& admin.getAdminPassword().equals(pwd))
		try {
			a = adminRepo.save(admin);
			AdminResponseDto adminResponseDto = AppUtils.mapAdminToDto(a);
			return adminResponseDto;
		} catch (AdminNotFoundException e) {
			throw new AdminNotFoundException("Admin not saved...");
		}
		else {
			throw new AdminNotFoundException("Not have authority...");
		}

	}

	@Override
	public AdminResponseDto login(String adminEmail, String adminPassword) {
		Admin admin = adminRepo.findByAdminEmailOrAdminPassword(adminEmail, adminPassword);
		System.out.println(admin);
		if (admin != null) {
			if (admin.getAdminPassword().equals(adminPassword)) {
				System.out.println("login successfull");
				AdminResponseDto adminResponseDto = AppUtils.mapAdminToDto(admin);
				return adminResponseDto;

			} else {
				throw new AdminNotFoundException("Username or Password is Incorrect...");
			}
		}
		return null;
	}

	@Override
	public AdminResponseDto adminForgotPwd(String adminEmail, String adminPassword) {
		Admin admin = adminRepo.findByAdminEmail(adminEmail);
		System.out.println(admin);
		if (admin != null) {
			admin.setAdminPassword(adminPassword);
			adminRepo.save(admin);
			System.out.println("admin reset successfully");
			System.out.println(admin);
			AdminResponseDto adminResponseDto = AppUtils.mapAdminToDto(admin);
			return adminResponseDto;
		} else {
			throw new AdminNotFoundException("Username or Password is Incorrect...");
		}

	}

	@Override
	public void deleteAdmin(String adminEmail) {
		Admin admin = adminRepo.findByAdminEmail(adminEmail);
		System.out.println(admin);
		if (admin != null) {
			adminRepo.delete(admin);
			System.out.println("admin deleted successfully");
		} else {
			throw new AdminNotFoundException("Admin not Found...");
		}

	}

}
