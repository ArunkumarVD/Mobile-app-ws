package com.appsdeveloperblog.app.ws.io.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "users")
public class UserEntity implements Serializable {

	private static final long serialVersionUID = 5313493413859894403L;
	@Id
	@GeneratedValue
	private long id;
	@Column(nullable = false)
	private String userId;
	@Column(nullable = false, length = 50)
	private String firstName;
	@Column(nullable = false, length = 50)
	private String lastName;
	public boolean isEmailVerificationStatus() {
		return emailVerificationStatus;
	}

	public void setEmailVerificationStatus(boolean emailVerificationStatus) {
		this.emailVerificationStatus = emailVerificationStatus;
	}

	@Column(nullable = false, length = 120)
	private String email;
	@Column(nullable = false)
	private String encrptedPassword;
	private String emailVerificationToken;
	@Column(nullable = false)
	private boolean emailVerificationStatus = false;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEncrptedPassword() {
		return encrptedPassword;
	}

	public void setEncrptedPassword(String encrptedPassword) {
		this.encrptedPassword = encrptedPassword;
	}

	public String getEmailVerificationToken() {
		return emailVerificationToken;
	}

	public void setEmailVerificationToken(String emailVerificationToken) {
		this.emailVerificationToken = emailVerificationToken;
	}
	/*
	 * public boolean getEmailVerificationStatus() { return emailVerificationStatus;
	 * } public void setEmailVerificationStatus(boolean emailVerificationStatus) {
	 * this.emailVerificationStatus = emailVerificationStatus; }
	 */

}
