package com.estrutura_projeto.dto;

public class UsuarioDTO {

    private String nome;
    private String email;
    private String dataNascimento;
    private String sexo;
    private String cep;
    private AcessoDTO acesso;

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

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
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

    public AcessoDTO getAcesso() {
        return acesso;
    }

    public void setAcesso(AcessoDTO acesso) {
        this.acesso = acesso;
    }

    public UsuarioDTO(){
        
    }

    public UsuarioDTO(String nome, String email, String dataNascimento, String sexo, String cep, AcessoDTO acesso){
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.sexo= sexo;
        this.cep = cep;
        this.acesso = acesso;
    }
    
}
