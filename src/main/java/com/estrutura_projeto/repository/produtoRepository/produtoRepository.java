package com.estrutura_projeto.repository.produtoRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estrutura_projeto.entity.categoria.Categoria;

public interface produtoRepository extends JpaRepository <Categoria, Long>{
    
}
