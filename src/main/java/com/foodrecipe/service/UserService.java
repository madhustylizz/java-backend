package com.foodrecipe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodrecipe.entity.User;
import com.foodrecipe.repo.UserRepository;



@Service
public class UserService {
	
		
	@Autowired
	private UserRepository userRepository;
	
	public User getUserByEmail(String email) {
		return userRepository.findUserByEmail(email);
	}
	
	public List<User> listAll()
	{
		return userRepository.findAll();
	}
	
	public User save(User user) {
		return userRepository.save(user);
		
	}
	public User FindByid(int id) {
		return userRepository.getById(id);
	}
}
