package com.dsf.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dsf.model.ProdutoModel;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {

}