package com.example.pets_store.security.dto;

import java.util.HashSet;
import java.util.Set;

import lombok.Data;

@Data
public class NewUserDto {
	
    
    private String nombre;
    
    private String nombreUsuario;
    
    private String email;
    
    private String password;  
    private Set<String> roles = new HashSet<>();

}
