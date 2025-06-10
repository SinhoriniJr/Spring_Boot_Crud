package com.estrutura_projeto.repository.produtoRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estrutura_projeto.entity.produto.Produto;

public interface produtoRepository extends JpaRepository <Produto, Long>{
    
}
