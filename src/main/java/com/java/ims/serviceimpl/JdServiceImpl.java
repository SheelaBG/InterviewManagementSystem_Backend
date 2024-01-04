package com.java.ims.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.ims.dto.JdRequestDto;
import com.java.ims.dto.JdResponseDto;
import com.java.ims.entity.JobDescription;
import com.java.ims.repository.JdRepository;
import com.java.ims.service.JdService;
import com.java.ims.utils.AppUtils;

@Service
public class JdServiceImpl implements JdService {
	
	@Autowired
	private JdRepository jdRepo;

	@Override
	public JdResponseDto createJd(JdRequestDto jdRequestDto) {
		JobDescription jd= AppUtils.mapDtoToJd(jdRequestDto);
		JobDescription jobDescription=null;
		try {
			jobDescription=jdRepo.save(jd);
			JdResponseDto jdResponseDto=AppUtils.mapJdToDto(jobDescription);
			return jdResponseDto;
		}
		catch(RuntimeException e)
		{
			e.printStackTrace();
		}
				
		return null;
	}

	@Override
	public JdResponseDto getJdById(Integer jdId) {
		Optional<JobDescription> jobDescription=jdRepo.findById(jdId);
		if(jobDescription.isPresent())
		{
			
			JdResponseDto jdResponseDto = AppUtils.mapJdToDto(jobDescription.get());
			return jdResponseDto;
		}
		else {
			throw new RuntimeException();
		}
	}

	@Override
	public List<JobDescription> getAll() {
		
		return jdRepo.findAll();
	}

	

	
}
