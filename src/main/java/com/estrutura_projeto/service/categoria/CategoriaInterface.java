package com.estrutura_projeto.service.categoria;

import java.util.List;
import java.util.Optional;

import com.estrutura_projeto.dto.categoriaDTO.CategoriaDTO;
import com.estrutura_projeto.entity.categoria.Categoria;

public interface CategoriaInterface {
    CategoriaDTO salvar (CategoriaDTO categoriaDTO);

    List<Categoria> listarCategoria();

    Optional<Categoria> buscarCategoriaPorId(Long id);

    Categoria atualizarCategoria(CategoriaDTO categoriaDTO);

    void excluirCategoria(Long id);

}
