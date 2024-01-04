package com.java.ims.service;

import java.util.List;

import com.java.ims.dto.JdRequestDto;
import com.java.ims.dto.JdResponseDto;
import com.java.ims.entity.JobDescription;


public interface JdService {

	JdResponseDto createJd(JdRequestDto jdRequestDto);

	JdResponseDto getJdById(Integer jdId);

	List<JobDescription> getAll();


}
