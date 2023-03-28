package com.example.pets_store.security.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pets_store.security.entity.User;
import com.example.pets_store.security.repository.IUserRepository;

@Service
@Transactional
public class UserService {
	
	@Autowired
	IUserRepository userRepository; 
	
	public List<User> getAll(){
		return userRepository.findAll();
	}
	
	public Optional<User> getByUserName(String userName){
		return userRepository.findByUserName(userName);
	}
	
	public boolean existsByNombreUsuario(String nombreUsuario) {
		User user= userRepository.existEmail(nombreUsuario);
		if(user !=null) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean existsByEmail(String email) {
		User user= userRepository.existEmail(email);
		if(user !=null) {
			return true;
		}else {
			return false;
		}
	}
	
	public User save(User user) {
		return userRepository.save(user);
	}
}
