package com.example.pets_store.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.pets_store.security.entity.Rol;
import com.example.pets_store.security.enums.RolName;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer>{

	@Query(value = "SELECT * FROM DBUSER.ROLES r WHERE r.NAME= ?1",nativeQuery = true)
	Optional<Rol> findByRolName(RolName rolName);
}
