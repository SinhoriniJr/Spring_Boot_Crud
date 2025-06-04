package com.estrutura_projeto.dto;

public class AcessoDTO {

    private String tipoAcesso;
    private String senha;
    
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

    public AcessoDTO(){

    }

    public AcessoDTO (String tipoAcesso, String senha) {
        this.tipoAcesso = tipoAcesso;
        this.senha = senha;
    }
    
}
