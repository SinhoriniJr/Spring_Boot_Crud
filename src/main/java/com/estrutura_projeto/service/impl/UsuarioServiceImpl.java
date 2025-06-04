package com.estrutura_projeto.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estrutura_projeto.dto.UsuarioDTO;
import com.estrutura_projeto.entity.Acesso;
import com.estrutura_projeto.entity.Usuario;
import com.estrutura_projeto.repository.AcessoRepository;
import com.estrutura_projeto.repository.UsuarioRepository;
import com.estrutura_projeto.service.UsuarioService;
import com.estrutura_projeto.util.HashUtil;

@Service
public class UsuarioServiceImpl  implements UsuarioService{

    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private AcessoRepository acessoRepository;
    @Override
    public Usuario cadastrarUsuario(UsuarioDTO usuarioDTO){
        if(usuarioRepository. findByEmail(usuarioDTO.getEmail()).isPresent()){
            throw new IllegalArgumentException("E-mail ja cadastrado.");
        }
        String senhaHash = HashUtil.gerarHashSHA256(usuarioDTO.getAcesso().getSenha());

        Usuario usuario = new Usuario( 
            usuarioDTO.getNome(),
            usuarioDTO.getEmail(),
            usuarioDTO.getDataNascimento(),
            usuarioDTO.getSexo(),
            usuarioDTO.getCep()
        );

        Acesso acesso = new Acesso(usuario, "USER", senhaHash);
        usuario.setAcesso(acesso);

        Usuario usuarioSalvo = usuarioRepository.save(usuario);
        acessoRepository.save(acesso);
        return usuarioSalvo;
    }
    @Override
    public List<Usuario> listarUsuarios() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarUsuarios'");
    }
    @Override
    public Usuario atualizarUsuario(Long id, UsuarioDTO usuarioDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizarUsuario'");
    }
    @Override
    public void deletarUsuario(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletarUsuario'");
    }

    @Override
    public  Optional<Usuario> buscarUsuarioPorId(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletarUsuario'");
    }

 

    
}
