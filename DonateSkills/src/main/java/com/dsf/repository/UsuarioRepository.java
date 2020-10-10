package com.dsf.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.dsf.model.UsuarioModel;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long>{
	
}
