package com.atguigu.spring.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.spring.annotation.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("userService add.....");
		userRepository.save();
	}
}
