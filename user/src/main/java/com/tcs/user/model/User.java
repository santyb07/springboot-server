package com.tcs.user.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="User_info")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private long consumerNumber;
	private int billNumber;
	private String title;
	private String name;
	private String email;
	private long mobile;
	private String userId;
	private String password;
	private String confirmPassword;
	public User(int id, long consumerNumber, int billNumber, String title, String name, String email, long mobile,
			String userId, String password, String confirmPassword) {
		super();
		this.id = id;
		this.consumerNumber = consumerNumber;
		this.billNumber = billNumber;
		this.title = title;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.userId = userId;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}
	public User(long consumerNumber, int billNumber, String title, String name, String email, long mobile,
			String userId, String password, String confirmPassword) {
		super();
		this.consumerNumber = consumerNumber;
		this.billNumber = billNumber;
		this.title = title;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.userId = userId;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}
	public User() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getConsumerNumber() {
		return consumerNumber;
	}
	public void setConsumerNumber(long consumerNumber) {
		this.consumerNumber = consumerNumber;
	}
	public int getBillNumber() {
		return billNumber;
	}
	public void setBillNumber(int billNumber) {
		this.billNumber = billNumber;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", consumerNumber=" + consumerNumber + ", billNumber=" + billNumber + ", title="
				+ title + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", userId=" + userId
				+ ", password=" + password + ", confirmPassword=" + confirmPassword + "]";
	}

}
