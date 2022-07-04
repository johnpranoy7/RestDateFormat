package com.john.graphite.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
public class EmployeeDto {
	private int eId;
	private String name;
	private Date dob;
	private LocalDate doj;
	private LocalDateTime dojt;
}
