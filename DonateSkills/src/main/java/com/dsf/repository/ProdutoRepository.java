package com.dsf.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.dsf.model.ProdutoModel;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {

}