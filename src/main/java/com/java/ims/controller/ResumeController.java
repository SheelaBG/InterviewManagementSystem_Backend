package com.java.ims.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.java.ims.dto.JdResponseDto;
import com.java.ims.entity.Resume;
import com.java.ims.service.ResumeService;

@RestController
@CrossOrigin
@RequestMapping("/api/resume")
public class ResumeController {

 @Autowired
 private ResumeService resumeService;
 
 @PostMapping("upload")
 public ResponseEntity<String> handleFileUpload(@RequestPart("file") MultipartFile file) throws IOException  {
     resumeService.savePdfFile(file.getOriginalFilename(), file);
	 return new ResponseEntity<>("File uploaded successfully!", HttpStatus.OK);
 }
 
 @GetMapping("/getById/{id}")
	public ResponseEntity<Resume> getResumeById(@PathVariable Integer id) {
		Resume resume = resumeService.getResumeById(id);
		return ResponseEntity.status(HttpStatus.OK).body(resume);

	}
 
 
}


