package com.mgmt.emp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mgmt.emp.model.Roles;

@Service
public interface RolesService {

	public List<Roles> showRoles();

	public String addRole(Roles role);

}
