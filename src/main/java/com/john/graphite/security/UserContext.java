package com.john.graphite.security;

import java.io.Serializable;

public class UserContext implements Serializable {
	public UserContext(User usr) {
		this.user = usr;
	}

	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
}
