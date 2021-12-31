package com.mgmt.emp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mgmt.emp.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	public User getUserByUsername(String username);

}
