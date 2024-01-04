package com.java.ims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.ims.entity.Admin;
import com.java.ims.entity.User;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {

	Admin findByAdminEmailOrAdminPassword(String adminEmail, String adminPassword);

	Admin findByAdminEmail(String adminEmail);

}
