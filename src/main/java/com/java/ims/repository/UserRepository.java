package com.java.ims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.ims.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	User getByEmailOrPassword(String email, String password);

	User getByEmail(String email);

}
