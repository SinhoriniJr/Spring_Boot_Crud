package com.estrutura_projeto.service;

import java.util.List;
import java.util.Optional;

import com.estrutura_projeto.dto.produtoDTO.ProdutoDTO;
import com.estrutura_projeto.entity.produto.Produto;
import com.estrutura_projeto.service.produto.ProdutoInterface;

public class ProdutoService implements ProdutoInterface {

    @Override
    public ProdutoDTO salvarProduto(ProdutoDTO produtoDTODTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'salvarProduto'");
    }

    @Override
    public List<Produto> listarProduto() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarProduto'");
    }

    @Override
    public Optional<Produto> buscarProdutoPorId(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarProdutoPorId'");
    }

    @Override
    public Produto atualizarProduto(ProdutoDTO produtoDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizarProduto'");
    }

    @Override
    public void excluirProduto(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'excluirProduto'");
    }
    
}
