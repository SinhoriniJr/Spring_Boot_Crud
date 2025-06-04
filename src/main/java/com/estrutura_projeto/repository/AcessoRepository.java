package com.estrutura_projeto.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estrutura_projeto.entity.Acesso;

public interface AcessoRepository extends JpaRepository <Acesso, Long> {

    List<Acesso> findByUsuarioId(Long usuarioId);

    Optional<Acesso> findByUsuarioIdAndTipoAcesso(Long usuarioId, String tipoAcesso);
    
}
