package com.mgmt.emp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mgmt.emp.model.Roles;

@Repository
public interface RolesRepository extends JpaRepository<Roles, Integer> {

}
