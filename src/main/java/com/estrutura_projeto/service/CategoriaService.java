package com.estrutura_projeto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estrutura_projeto.dto.categoriaDTO.CategoriaDTO;
import com.estrutura_projeto.entity.categoria.Categoria;
import com.estrutura_projeto.repository.categoriaRepository.CategoriaRepository;
import com.estrutura_projeto.service.categoria.CategoriaInterface;

@Service
public class CategoriaService implements CategoriaInterface{

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public CategoriaDTO salvar(CategoriaDTO categoriaDTO){
        Categoria categoria =new Categoria(
            categoriaDTO.getId(),
            categoriaDTO.getNome(),
            null
       
        );
        categoria.setId(categoriaRepository.save(categoria).getId());
        categoriaDTO.setId(categoria.getId());
        return categoriaDTO;

    }

    @Override
    public List<Categoria> listarCategoria() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarCategoria'");
    }

    @Override
    public Optional<Categoria> buscarCategoriaPorId(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarCategoriaPorId'");
    }

    @Override
    public Categoria atualizarCategoria(CategoriaDTO categoriaDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizarCategoria'");
    }

    @Override
    public void excluirCategoria(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'excluirCategori'");
    }
    
}
