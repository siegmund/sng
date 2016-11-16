package de.grps.domain.models;

import org.hibernate.validator.constraints.Email;
import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class User {
	
	@Id private String id;
	
	private String name;
	private String email;
	private String password;
	
	private User() {};
	
	public User(final String name, final String password) {
		this.name = name;
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Email
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
