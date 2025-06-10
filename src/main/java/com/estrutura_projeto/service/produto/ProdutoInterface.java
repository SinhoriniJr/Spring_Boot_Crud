package com.estrutura_projeto.service.produto;

import java.util.List;
import java.util.Optional;

import com.estrutura_projeto.dto.produtoDTO.ProdutoDTO;
import com.estrutura_projeto.entity.produto.Produto;

public interface ProdutoInterface {
    ProdutoDTO salvarProduto(ProdutoDTO produtoDTODTO);

    List<Produto> listarProduto();

    Optional<Produto> buscarProdutoPorId(Long id);

    Produto atualizarProduto(ProdutoDTO produtoDTO);

    void excluirProduto(Long id);

}