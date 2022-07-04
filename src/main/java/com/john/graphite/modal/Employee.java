package com.john.graphite.modal;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.john.graphite.serialisers.JsonLocalDateSerializer;

import lombok.Data;

@Data
@Entity
public class Employee {
	@Id
	@GeneratedValue(generator = "org.hibernate.id.UUIDGenerator", strategy = GenerationType.IDENTITY)
	private int eId;
	private String name;
	private Date dob;
	@JsonSerialize(using=JsonLocalDateSerializer.class)
	private LocalDate doj;
	private LocalDateTime dojt;
}
