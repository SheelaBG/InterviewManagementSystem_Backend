package com.java.ims.utils;

import com.java.ims.dto.AdminRequestDto;
import com.java.ims.dto.AdminResponseDto;
import com.java.ims.dto.ApplicantRequestDto;
import com.java.ims.dto.ApplicantResponseDto;
import com.java.ims.dto.JdRequestDto;
import com.java.ims.dto.JdResponseDto;
import com.java.ims.dto.UserRequestDto;
import com.java.ims.dto.UserResponseDto;
import com.java.ims.entity.Admin;
import com.java.ims.entity.Applicant;
import com.java.ims.entity.JobDescription;
import com.java.ims.entity.User;

public class AppUtils {
	
	//user
	public static User mapDtoToUser(UserRequestDto userRequestDto)
	{
		User user=new User();
		user.setUsername(userRequestDto.getUsername());
		user.setPassword(userRequestDto.getPassword());
		user.setEmail(userRequestDto.getEmail());
		user.setMobileNo(userRequestDto.getMobileNo());
		return user;
	}
	
	public static UserResponseDto mapUserToDto(User user)
	{
		UserResponseDto userResponse=new UserResponseDto();
		userResponse.setUsername(user.getUsername());
		userResponse.setPassword(user.getPassword());
		userResponse.setEmail(user.getEmail());
		userResponse.setMobileNo(user.getMobileNo());
		return userResponse;
	}
	
	//jd
	public static JobDescription mapDtoToJd(JdRequestDto jdRequestDto)
	{
		JobDescription jobDescription=new JobDescription();
		jobDescription.setRole(jdRequestDto.getRole());
		jobDescription.setJobBrief(jdRequestDto.getJobBrief());
		jobDescription.setExp(jdRequestDto.getExp());
		jobDescription.setSkills(jdRequestDto.getSkills());
		return jobDescription;
	}
	
	public static JdResponseDto mapJdToDto(JobDescription jobDescription)
	{
		JdResponseDto jdResponseDto=new JdResponseDto();
		jdResponseDto.setRole(jobDescription.getRole());
		jdResponseDto.setJobBrief(jobDescription.getJobBrief());
		jdResponseDto.setExp(jobDescription.getExp());
		jdResponseDto.setSkills(jobDescription.getSkills());
		return jdResponseDto;
	}
	
	
	
	//Applicant
	public static Applicant mapDtoToApplicant(ApplicantRequestDto applicantRequestDto)
	{
		Applicant applicant=new Applicant();
		applicant.setFirstName(applicantRequestDto.getFirstName());
		applicant.setLastName(applicantRequestDto.getLastName());
		applicant.setDateOfBirth(applicantRequestDto.getDateOfBirth());
		applicant.setGender(applicantRequestDto.getGender());
		applicant.setDegree(applicantRequestDto.getDegree());
		applicant.setPassoutYear(applicantRequestDto.getPassoutYear());
		applicant.setPercentage(applicantRequestDto.getPercentage());
		applicant.setExperience(applicantRequestDto.getExperience());
		applicant.setEmail(applicantRequestDto.getEmail());
		applicant.setMobileNo(applicantRequestDto.getMobileNo());
		
		return applicant;
	}
	
	public static ApplicantResponseDto mapApplicantToDto(Applicant applicant)
	{
		ApplicantResponseDto applicantResponseDto=new ApplicantResponseDto();
		applicantResponseDto.setFirstName(applicant.getFirstName());
		applicantResponseDto.setLastName(applicant.getLastName());
		applicantResponseDto.setDateOfBirth(applicant.getDateOfBirth());
		applicantResponseDto.setGender(applicant.getGender());
		applicantResponseDto.setDegree(applicant.getDegree());
		applicantResponseDto.setPassoutYear(applicant.getPassoutYear());
		applicantResponseDto.setPercentage(applicant.getPercentage());
		applicantResponseDto.setExperience(applicant.getExperience());
		applicantResponseDto.setEmail(applicant.getEmail());
		applicantResponseDto.setMobileNo(applicant.getMobileNo());
		return applicantResponseDto;
	}
	
	
	//Admin
	
	public static Admin mapDtoToAdmin(AdminRequestDto adminRequestDto)
	{
		Admin admin=new Admin();
		admin.setAdminName(adminRequestDto.getAdminName());
		admin.setAdminEmail(adminRequestDto.getAdminEmail());
		admin.setAdminPassword(adminRequestDto.getAdminPassword());
		
		return admin;
	}
	
	public static AdminResponseDto mapAdminToDto(Admin admin)
	{
		AdminResponseDto adminResponseDto= new AdminResponseDto();
		adminResponseDto.setAdminName(admin.getAdminName());
		adminResponseDto.setAdminEmail(admin.getAdminEmail());
		adminResponseDto.setAdminPassword(admin.getAdminPassword());
		return adminResponseDto;
	}

	
}
