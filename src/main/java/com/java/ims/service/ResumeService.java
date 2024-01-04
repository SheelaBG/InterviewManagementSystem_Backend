package com.java.ims.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import com.java.ims.entity.Resume;

public interface ResumeService {

	void savePdfFile(String originalFilename, MultipartFile file) throws IOException;

	Resume getResumeById(Integer id);



}
