package com.sesi.projeto.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.sesi.projeto.dto.ProdutoDTO;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoDTO, Long>{

}
