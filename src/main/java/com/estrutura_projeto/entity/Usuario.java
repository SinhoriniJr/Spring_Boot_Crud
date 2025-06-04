package com.estrutura_projeto.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private Long id;
    private String nome;
    @Column (unique = true, nullable = false)
    private String email;
    @Column(name = "data_nascimento")
    private String dataNascimento;
    private String sexo;
    @Column(length = 9, nullable =false)
    private String cep;

    @OneToOne(mappedBy ="usuario", cascade = CascadeType.ALL)
    @JsonIgnore // Evita a serialização do acesso
    private Acesso acesso;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataNAscimento() {
        return dataNascimento;
    }

    public void setDataNAscimento(String dataNAscimento) {
        this.dataNascimento = dataNAscimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Acesso getAcesso() {
        return acesso;
    }

    public void setAcesso(Acesso acesso) {
        this.acesso = acesso;
    }

    public Usuario (){

    }
    public Usuario(String nome, String email, String dataNascimento, String sexo, String cep){
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.sexo =sexo;
        this.cep = cep;
    }
  



    
}
