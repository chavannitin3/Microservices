package com.example.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.user.entity.User;
import com.example.user.model.DepartmentModel;
import com.example.user.model.UserDepartmentModel;
import com.example.user.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	public User saveUser(User user) {
		return userRepository.save(user);
	}

	public UserDepartmentModel getUserDepartmentByUserId(Long userId) {
		UserDepartmentModel userDepartmentModel = new UserDepartmentModel();
		User user = userRepository.findByUserId(userId);
		DepartmentModel department = restTemplate.getForObject("http://localhost:9001/department/"+ user.getDepartmentId(), DepartmentModel.class);
		userDepartmentModel.setUser(user);
		userDepartmentModel.setDepartment(department);
		return userDepartmentModel;
	}
}
