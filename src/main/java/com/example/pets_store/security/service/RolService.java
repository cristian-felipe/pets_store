package com.example.pets_store.security.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pets_store.security.entity.Rol;
import com.example.pets_store.security.enums.RolName;
import com.example.pets_store.security.repository.IRolRepository;

@Service
@Transactional
public class RolService {
	@Autowired
	IRolRepository rolRepository;
	
    public Optional<Rol> getByRolNombre(RolName rolName){
        return rolRepository.findByRolName(rolName);
    }

    public Rol save(Rol rol){
    	return rolRepository.save(rol);
    }
}
