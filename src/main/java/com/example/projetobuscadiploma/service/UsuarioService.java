package com.example.projetobuscadiploma.service;

import com.example.projetobuscadiploma.dto.usuario.UsuarioRequest;
import com.example.projetobuscadiploma.dto.usuario.UsuarioResponse;
import com.example.projetobuscadiploma.mapper.UsuarioMapper;
import com.example.projetobuscadiploma.model.Usuario;
import com.example.projetobuscadiploma.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Transactional
    public UsuarioResponse create(UsuarioRequest usuarioRequest){
        Usuario user = usuarioRepository.save(UsuarioMapper.INSTANCE.toEntity(usuarioRequest));
        System.out.println(user);
        return builderResponse(user);
    }

    @Transactional
    public List<UsuarioResponse> listAll(){
        List<Usuario> users = usuarioRepository.findAll();
        return UsuarioMapper.INSTANCE.toListReponse(users);
    }

    @Transactional
    public UsuarioResponse findById(int id){

        return builderResponse(usuarioRepository.findById(id).orElse(new Usuario()));
    }

    @Transactional
    public UsuarioResponse update(int id, UsuarioRequest request){
        Usuario user = builderRequest(request);
        user.setId(id);
        return builderResponse(usuarioRepository.save(user));
    }

    @Transactional
    public void delete(int id){
        usuarioRepository.deleteById(id);
    }




    public Usuario builderRequest(UsuarioRequest ur){
        return Usuario.builder()
                .nomeUsuario(ur.getNomeUsuario())
                .email(ur.getEmail())
                .nomeCompleto(ur.getNomeCompleto())
                .password(ur.getPassword())
                .telefone(ur.getTelefone())
                .urlPerfilFoto(ur.getUrlPerfilFoto())
                .instagram(ur.getInstagram())
                .facebook(ur.getFacebook())
                .build();
    }

    public UsuarioResponse builderResponse(Usuario ur){
        return UsuarioResponse.builder()
                .id(ur.getId())
                .nomeUsuario(ur.getNomeUsuario())
                .email(ur.getEmail())
                .nomeCompleto(ur.getNomeCompleto())
                .password(ur.getPassword())
                .telefone(ur.getTelefone())
                .urlPerfilFoto(ur.getUrlPerfilFoto())
                .instagram(ur.getInstagram())
                .facebook(ur.getFacebook())
                .build();
    }
}
