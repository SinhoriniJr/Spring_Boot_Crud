package com.estrutura_projeto.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Acesso {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipoAcesso;
    @Column(length = 64)
    private String senha;

    @OneToOne
    @JoinColumn(name="usuario_id")
    private Usuario usuario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoAcesso() {
        return tipoAcesso;
    }

    public void setTipoAcesso(String tipoAcesso) {
        this.tipoAcesso = tipoAcesso;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Acesso(){

    }

    public Acesso(Usuario usuario, String tipoAcesso, String senha){


        this.usuario = usuario;
        this.tipoAcesso= tipoAcesso;
        this.senha = senha;

    }

}

