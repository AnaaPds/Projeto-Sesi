package com.sesi.projeto.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sesi.projeto.dto.CategoriaDTO;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaDTO, UUID> {

	

}
