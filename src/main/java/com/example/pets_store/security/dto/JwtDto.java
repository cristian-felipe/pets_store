package com.example.pets_store.security.dto;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

import lombok.Data;

@Data
public class JwtDto {
	private String token;
    private String bearer = "Bearer";
    private String nombreUsuario;
    private Collection<? extends GrantedAuthority> authorities;
    
	public JwtDto(String token, String nombreUsuario, Collection<? extends GrantedAuthority> authorities) {
		super();
		this.token = token;
		this.nombreUsuario = nombreUsuario;
		this.authorities = authorities;
	}


}

