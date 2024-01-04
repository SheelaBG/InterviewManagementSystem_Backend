package com.java.ims.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.ims.dto.ApplicantRequestDto;
import com.java.ims.dto.ApplicantResponseDto;
import com.java.ims.dto.UserRequestDto;
import com.java.ims.dto.UserResponseDto;
import com.java.ims.entity.Applicant;
import com.java.ims.entity.User;
import com.java.ims.exception.UserNotFoundException;
import com.java.ims.repository.ApplicantRepo;
import com.java.ims.repository.UserRepository;
import com.java.ims.service.ApplicantService;
import com.java.ims.utils.AppUtils;

import jakarta.validation.constraints.AssertFalse.List;

@Service
public class ApplicationServiceImpl implements ApplicantService {

	@Autowired
	private ApplicantRepo applicantRepo;
	
	@Override
	public ApplicantResponseDto createApplicant(ApplicantRequestDto applicantRequestDto) {
		
		Applicant applicant = AppUtils.mapDtoToApplicant(applicantRequestDto);
		Applicant a = null;
		try {
			a = applicantRepo.save(applicant);
			ApplicantResponseDto applicantResponseDto = AppUtils.mapApplicantToDto(a);
			return applicantResponseDto;
		} catch (RuntimeException e) {
			 e.printStackTrace();
		}
		return null;
	}

	@Override
	public java.util.List<Applicant> getAllApplicants() {

		return applicantRepo.findAll();
	}


}
