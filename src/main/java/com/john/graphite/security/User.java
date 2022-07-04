package com.john.graphite.security;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User implements Serializable{
	public User(String userId, String dateFormat2) {
		this.name = userId;
		this.dateFormat = dateFormat2;
	}
	private String name;
	private String dateFormat;
}
