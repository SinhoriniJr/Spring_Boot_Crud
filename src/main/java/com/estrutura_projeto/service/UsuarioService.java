package com.estrutura_projeto.service;


import java.util.List;
import java.util.Optional;

import com.estrutura_projeto.dto.UsuarioDTO;
import com.estrutura_projeto.entity.Usuario;

public interface UsuarioService {
    // cadastrar novo usuario e acesso vinculados
    Usuario cadastrarUsuario (UsuarioDTO usuarioDTO);
    
    // Listar todos os usuarios
    List<Usuario>listarUsuarios();

    // Buscar Usuario por ID
    Optional<Usuario>buscarUsuarioPorId(Long id);

    // Atualizar um Usuario
    Usuario atualizarUsuario(Long id, UsuarioDTO usuarioDTO);

    //remover um usuario
    void deletarUsuario(Long id);
}
