package com.john.graphite.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.john.graphite.modal.Employee;

public interface MyRepo extends JpaRepository<Employee, Object> {

}
