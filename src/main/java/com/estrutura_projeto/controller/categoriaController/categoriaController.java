package com.estrutura_projeto.controller.categoriaController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estrutura_projeto.dto.categoriaDTO.CategoriaDTO;
import com.estrutura_projeto.service.CategoriaService;

@RestController
@RequestMapping("/categoria")
public class categoriaController {

    @Autowired
    private CategoriaService CategoriaService;

    @PostMapping
    public ResponseEntity<CategoriaDTO> salvarCategoria(@RequestBody CategoriaDTO categoriaDTO){
        return ResponseEntity.ok(CategoriaService.salvar(categoriaDTO));
    }
    
}
