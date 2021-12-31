package com.mgmt.emp.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mgmt.emp.model.User;
import com.mgmt.emp.repository.UserRepository;
import com.mgmt.emp.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> showUsers() {
		return userRepository.findAll();
	}

	@Override
	public String addUser(User user) {
		userRepository.save(user);
		userRepository.flush();
		return "User Added";
	}

}
