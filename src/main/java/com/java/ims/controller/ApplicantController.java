package com.java.ims.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.ims.dto.ApplicantRequestDto;
import com.java.ims.dto.ApplicantResponseDto;
import com.java.ims.entity.Applicant;
import com.java.ims.service.ApplicantService;
import com.java.ims.service.UserService;

@RestController
@CrossOrigin
@RequestMapping("applicant")
public class ApplicantController {

	@Autowired
	private ApplicantService applicantService;

	@PostMapping("/post")
	public ResponseEntity<ApplicantResponseDto> applicantRegister(@RequestBody ApplicantRequestDto applicantRequestDto) {
		ApplicantResponseDto newApplicant = applicantService.createApplicant(applicantRequestDto);
		return ResponseEntity.status(HttpStatus.OK).body(newApplicant);

	}
	
	@GetMapping("/getAll")
    public ResponseEntity<?> getAllApplicants() {
        List<Applicant> allApplicants = applicantService.getAllApplicants();

//        ApplicantResponseDto responseDto = new ApplicantResponseDto();
//        responseDto.setApplicants(allApplicants);

        return ResponseEntity.status(HttpStatus.OK).body(allApplicants);
    }
	
	
	

}
