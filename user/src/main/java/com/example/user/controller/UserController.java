package com.example.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.entity.User;
import com.example.user.model.UserDepartmentModel;
import com.example.user.service.UserService;

@CrossOrigin(origins = "*", allowCredentials = "false", allowedHeaders = "*")
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/")
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
	
	@GetMapping("/{id}")
	public UserDepartmentModel getUserDepartmentByUserId(@PathVariable("id") Long userId) {
		return userService.getUserDepartmentByUserId(userId);
	}
	
	@GetMapping("/getUsers")
	public List<User> getUsers() {
		return userService.getUsers();
	}
}
