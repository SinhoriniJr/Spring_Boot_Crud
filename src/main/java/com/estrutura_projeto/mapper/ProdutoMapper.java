package com.estrutura_projeto.mapper;

import org.springframework.stereotype.Component;

import com.estrutura_projeto.dto.categoriaDTO.CategoriaDTO;
import com.estrutura_projeto.dto.produtoDTO.ProdutoDTO;
import com.estrutura_projeto.entity.categoria.Categoria;
import com.estrutura_projeto.entity.produto.Produto;

@Component
public class ProdutoMapper {

    public Produto toEntity(ProdutoDTO dto){
        Produto produto = new Produto();
        produto.setNome(dto.getNome());
        produto.setDescricao(dto.getDecricao());
        produto.setPreco(dto.getPreco());
        produto.setStatus(dto.getStatus());

        if (dto.getCategoria() != null && dto.getCategoria().getId() != null){
            Categoria categoria = new Categoria();
            categoria.setId(dto.getCategoria().getId());
            produto.setCategoria(categoria);
        }

        return produto;
    }

    public ProdutoDTO toDTO(Produto entity){
        ProdutoDTO dto = new Produto(entity.getId(), entity.getNome(), entity.getDescricao(), entity.getPreco(), entity.getStatus());

        if(entity.getCategoria() != null){
            CategoriaDTO categoriaDTO = new CategoriaDTO();
            categoriaDTO.setId(entity.getCategoria().getId());
            categoriaDTO.setNome(entity.getCategoria().getNome());
            dto.setCategoria(categoriaDTO);
        } 

        return dto;
    }
    
}
