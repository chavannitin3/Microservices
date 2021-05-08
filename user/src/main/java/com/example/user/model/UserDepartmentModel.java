package com.example.user.model;

import com.example.user.entity.User;

public class UserDepartmentModel {
	private User user;
	private DepartmentModel department;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public DepartmentModel getDepartment() {
		return department;
	}
	public void setDepartment(DepartmentModel department) {
		this.department = department;
	}
	
}
