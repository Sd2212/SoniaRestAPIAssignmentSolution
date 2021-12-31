package com.mgmt.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mgmt.emp.model.User;
import com.mgmt.emp.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("/showUsers")
	public List<User> showUsers() {
		return userService.showUsers();
	}

	@PostMapping("/addUser")
	public String addUser(@RequestBody User user) {
		return userService.addUser(user);
	}

}
