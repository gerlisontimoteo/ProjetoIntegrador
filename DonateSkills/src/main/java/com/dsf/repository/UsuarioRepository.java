package com.dsf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dsf.model.UsuarioModel;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long>{

}
