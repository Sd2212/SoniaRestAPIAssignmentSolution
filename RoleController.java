package com.mgmt.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mgmt.emp.model.Roles;
import com.mgmt.emp.service.RolesService;

@RestController
@RequestMapping("/role")
public class RoleController {

	@Autowired
	RolesService roleService;

	@PostMapping("/showRoles")
	public List<Roles> showRoles() {
		return roleService.showRoles();
	}

	@PostMapping("/addRole")
	public String addRole(@RequestBody Roles role) {
		return roleService.addRole(role);
	}

}
