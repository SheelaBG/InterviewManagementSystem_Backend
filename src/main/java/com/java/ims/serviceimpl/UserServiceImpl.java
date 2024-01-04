package com.java.ims.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.ims.dto.UserRequestDto;
import com.java.ims.dto.UserResponseDto;
import com.java.ims.entity.User;
import com.java.ims.exception.UserNotFoundException;
import com.java.ims.repository.UserRepository;
import com.java.ims.service.UserService;
import com.java.ims.utils.AppUtils;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;

	@Override
	public UserResponseDto createUser(UserRequestDto userDto) {
		User user = AppUtils.mapDtoToUser(userDto);
		User u = null;
		try {
			u = userRepo.save(user);
			UserResponseDto userResponseDto = AppUtils.mapUserToDto(u);
			return userResponseDto;
		} catch (UserNotFoundException e) {
			throw new UserNotFoundException("User not saved in database");
		}

	}

	@Override
	public UserResponseDto login(String email, String password) {
		User user = userRepo.getByEmailOrPassword(email, password);
		System.out.println(email + "" + password);
		System.out.println(user);

		if (user != null) {
			if (user.getPassword().equals(password)) {

				UserResponseDto userResponseDto = AppUtils.mapUserToDto(user);
				return userResponseDto;

			} else {

				throw new UserNotFoundException("Username or Password is inCorrect");

			}
		}
		return null;
	}

	@Override
	public UserResponseDto ForgotPwd(String email, String password) {
		User user = userRepo.getByEmail(email);
		System.out.println(user);
		if (user != null) {
			user.setPassword(password);
			userRepo.save(user);
			System.out.println("password reset successfully");
			System.out.println(user);
			UserResponseDto userResponseDto = AppUtils.mapUserToDto(user);
			return userResponseDto;
		} else {
			throw new UserNotFoundException("Username or Password is inCorrect");
		}
	}

	@Override
	public void delete(String email) {
		User user = userRepo.getByEmail(email);
		System.out.println(user);
		if (user != null) {
			userRepo.delete(user);
			System.out.println("user deleted successfully");
		} else {
			throw new UserNotFoundException("User not found");
		}

	}
}
