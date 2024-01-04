package com.java.ims.service;

import java.util.List;

import com.java.ims.dto.ApplicantRequestDto;
import com.java.ims.dto.ApplicantResponseDto;
import com.java.ims.entity.Applicant;

public interface ApplicantService {

	ApplicantResponseDto createApplicant(ApplicantRequestDto applicantRequestDto);

	List<Applicant> getAllApplicants();

}
