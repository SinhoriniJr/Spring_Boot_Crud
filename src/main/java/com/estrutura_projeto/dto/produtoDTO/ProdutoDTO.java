package com.estrutura_projeto.dto.produtoDTO;

import com.estrutura_projeto.dto.categoriaDTO.CategoriaDTO;
import com.estrutura_projeto.enums.StatusProdutos;

public class ProdutoDTO {

    private Long id;
    private String nome;
    private String decricao;
    private Double preco;
    private StatusProdutos status;
    private CategoriaDTO categoria;

    public ProdutoDTO(){
        
    }

    public ProdutoDTO(Long id, String nome, String decricao, Double preco, StatusProdutos status,
            CategoriaDTO categoria) {
        this.id = id;
        this.nome = nome;
        this.decricao = decricao;
        this.preco = preco;
        this.status = status;
        this.categoria = categoria;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDecricao() {
        return decricao;
    }

    public void setDecricao(String decricao) {
        this.decricao = decricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public StatusProdutos getStatus() {
        return status;
    }

    public void setStatus(StatusProdutos status) {
        this.status = status;
    }

    public CategoriaDTO getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaDTO categoria) {
        this.categoria = categoria;
    }
    

    
    
}
