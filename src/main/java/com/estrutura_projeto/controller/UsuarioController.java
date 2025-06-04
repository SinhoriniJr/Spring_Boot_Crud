package com.estrutura_projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estrutura_projeto.dto.UsuarioDTO;
import com.estrutura_projeto.entity.Usuario;
import com.estrutura_projeto.service.impl.UsuarioServiceImpl;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioServiceImpl usuarioService;

    @PostMapping
    public ResponseEntity<?> salvar (@RequestBody UsuarioDTO usuarioDTO){
        try{
            Usuario usuario = usuarioService.cadastrarUsuario(usuarioDTO);
            return ResponseEntity.ok(usuario);
        } catch(IllegalArgumentException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> listarUsuarios(){
        List<Usuario> usuarios = usuarioService.listarUsuarios();
        return ResponseEntity.ok(usuarios);
    }

    
}
