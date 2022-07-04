package com.john.graphite;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.john.graphite.modal.Employee;
import com.john.graphite.repo.MyRepo;
import com.john.graphite.security.User;
import com.john.graphite.security.UserContext;
import com.john.graphite.security.UserContextHolder;

@RestController
public class MyController {
	@Autowired
	private MyRepo employeeRepo;

	@GetMapping("/")
	public List<Employee> displayEmployees(@RequestHeader(value = "userId") String userId,
			@RequestHeader(value = "dateFormat") String dateFormat) {
		User usr = new User(userId, dateFormat);
		UserContextHolder.setContext(new UserContext(usr));
		List<Employee> all = employeeRepo.findAll();
		return all;
	}

	@PostMapping("/")
	public Employee insertEmployees(@RequestBody Employee emp) {
		return employeeRepo.save(emp);
	}
}
