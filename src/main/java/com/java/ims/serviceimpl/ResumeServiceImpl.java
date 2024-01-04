package com.java.ims.serviceimpl;

import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.java.ims.entity.Resume;
import com.java.ims.repository.ResumeRepository;
import com.java.ims.service.ResumeService;


@Service
public class ResumeServiceImpl implements ResumeService {

    @Autowired
    private ResumeRepository resumeRepository;

	@Override
	public void savePdfFile(String originalFilename, MultipartFile file) throws IOException {
		Resume resume = new Resume();
		resume.setFileName(originalFilename);
		resume.setData(file.getBytes());
		resumeRepository.save(resume);
		
	}

	@Override
	public Resume getResumeById(Integer id) {
			Optional<Resume> resume=resumeRepository.findById(id);
			if(resume.isPresent())
			{
				return resume.get();
			}
			else {
				throw new RuntimeException();
			}
	} 

}