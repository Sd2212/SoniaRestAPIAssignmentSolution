package com.mgmt.emp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mgmt.emp.model.User;

@Service
public interface UserService {

	public List<User> showUsers();

	public String addUser(User user);

}
