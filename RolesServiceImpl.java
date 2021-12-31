package com.mgmt.emp.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mgmt.emp.model.Roles;
import com.mgmt.emp.repository.RolesRepository;
import com.mgmt.emp.service.RolesService;

@Service
public class RolesServiceImpl implements RolesService {

	@Autowired
	RolesRepository roleRepository;

	@Override
	public List<Roles> showRoles() {
		return roleRepository.findAll();
	}

	@Override
	public String addRole(Roles role) {
		roleRepository.save(role);
		roleRepository.flush();
		return " Added a role";
	}

}
