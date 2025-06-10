package com.estrutura_projeto.controller.categoriaController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estrutura_projeto.dto.categoriaDTO.CategoriaDTO;
import com.estrutura_projeto.entity.categoria.Categoria;
import com.estrutura_projeto.service.CategoriaService;

@RestController
@RequestMapping("/categoria")
public class categoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @PostMapping
    public ResponseEntity<CategoriaDTO> salvarCategoria(@RequestBody CategoriaDTO categoriaDTO){
        return ResponseEntity.ok(categoriaService.salvar(categoriaDTO));
    }
    @GetMapping
    public ResponseEntity<List<Categoria>> listarCategoria(){
        List<Categoria> categorias = categoriaService.listarCategoria();
        return ResponseEntity.ok(categorias);
    }

    @GetMapping("/{id}")
        public ResponseEntity<Categoria> buscarCategoriaPorId(@PathVariable Long id){
            return categoriaService.buscarCategoriaPorId(id)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
        }
    
    
    @PutMapping("/{id}")
    public ResponseEntity<Categoria> atualizarCategoria(@PathVariable Long id, @RequestBody CategoriaDTO categoriaDTO){
        try{
            Categoria categoriaAtualizada = categoriaService.atualizarCategoria(id,categoriaDTO);
            return ResponseEntity.ok(categoriaAtualizada);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
        public ResponseEntity<Void> deletarCategoria(@PathVariable Long id){
            try{
                categoriaService.excluirCategoria(id);
                return ResponseEntity.noContent().build();
            } catch (RuntimeException e){
                return ResponseEntity.notFound().build();
            }
        }


    
    
}
