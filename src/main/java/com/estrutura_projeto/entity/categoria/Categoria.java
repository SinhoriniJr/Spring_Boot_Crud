package com.estrutura_projeto.entity.categoria;

import java.util.List;

import com.estrutura_projeto.entity.produto.Produto;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50 , unique = true)
    private String name;

    @OneToMany(mappedBy = "categoria", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List <Produto> produtos;


    public Categoria(){
        
    }

    public Long getId() {
        return id;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Categoria(Long id, String name, List<Produto> produtos) {
        this.id = id;
        this.name = name;
        this.produtos = produtos;
    }
    


    
}
