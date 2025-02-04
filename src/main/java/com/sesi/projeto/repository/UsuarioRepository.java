package com.sesi.projeto.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sesi.projeto.dto.UsuarioDTO;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioDTO, UUID> {
	
	

}
