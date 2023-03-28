package com.example.pets_store.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pets_store.security.entity.User;
import com.example.pets_store.security.service.UserService;

@RestController
@RequestMapping("/api/user")
@CrossOrigin
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/list")
	public ResponseEntity<List<User>> list() {
		return new ResponseEntity<>(userService.getAll(),HttpStatus.ACCEPTED);
		
	}
}
