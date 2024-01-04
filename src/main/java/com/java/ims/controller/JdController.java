package com.java.ims.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.ims.dto.JdRequestDto;
import com.java.ims.dto.JdResponseDto;
import com.java.ims.dto.UserRequestDto;
import com.java.ims.entity.JobDescription;
import com.java.ims.service.JdService;


@RestController
@CrossOrigin
@RequestMapping("jd")
public class JdController {
	@Autowired
	private JdService jdService;

	@PostMapping("/post")
	public ResponseEntity<JdResponseDto> createJd(@RequestBody JdRequestDto jdRequestDto) {
		JdResponseDto jd = jdService.createJd(jdRequestDto);
		return ResponseEntity.status(HttpStatus.OK).body(jd);

	}

	@GetMapping("/getById/{jdId}")
	public ResponseEntity<JdResponseDto> getJdById(@PathVariable Integer jdId) {
		JdResponseDto jd = jdService.getJdById(jdId);
		return ResponseEntity.status(HttpStatus.OK).body(jd);

	}
	@GetMapping("/getAll")
	public ResponseEntity<?> getAll() {
		List<JobDescription> listOfJd = jdService.getAll();
		return ResponseEntity.status(HttpStatus.OK).body(listOfJd);

	}

}
