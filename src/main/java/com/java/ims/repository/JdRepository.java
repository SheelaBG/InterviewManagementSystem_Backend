package com.java.ims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.ims.entity.JobDescription;

@Repository
public interface JdRepository extends JpaRepository<JobDescription, Integer>{

}
