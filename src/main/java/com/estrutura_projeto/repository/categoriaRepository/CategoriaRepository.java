package com.estrutura_projeto.repository.categoriaRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estrutura_projeto.entity.categoria.Categoria;

public interface CategoriaRepository extends JpaRepository <Categoria, Long> {

    
} 
    

