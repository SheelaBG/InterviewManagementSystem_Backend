package com.java.ims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.ims.entity.Applicant;

@Repository
public interface ApplicantRepo extends JpaRepository<Applicant, Integer> {

}
