package com.estrutura_projeto.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estrutura_projeto.entity.Usuario;

public interface UsuarioRepository extends JpaRepository <Usuario, Long>{
    Optional<Usuario> findByEmail(String email);


    
}
