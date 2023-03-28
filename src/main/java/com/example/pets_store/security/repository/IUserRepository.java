package com.example.pets_store.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.pets_store.security.entity.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer>{
	
	Optional<User> findByUserName(String userName);
	
	@Query(value = "SELECT * FROM USERS u WHERE u.NAME= ?1",nativeQuery = true)
	User existUser(String userName);
	
	@Query(value = "SELECT * FROM USERS u WHERE u.EMAIL= ?1",nativeQuery = true)
	User existEmail(String email);

}
