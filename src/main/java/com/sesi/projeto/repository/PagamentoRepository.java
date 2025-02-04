package com.sesi.projeto.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sesi.projeto.dto.PagamentoDTO;

public interface PagamentoRepository extends JpaRepository<PagamentoDTO, UUID> {

	List<PagamentoDTO> findAll();

}
