package com.example.projetobuscadiploma.mapper;

import com.example.projetobuscadiploma.dto.usuario.UsuarioRequest;
import com.example.projetobuscadiploma.dto.usuario.UsuarioResponse;
import com.example.projetobuscadiploma.model.Usuario;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {
    UsuarioMapper INSTANCE = Mappers.getMapper(UsuarioMapper.class);


    UsuarioResponse toDTO(Usuario usuario);
    Usuario toEntity(UsuarioRequest request);
    List<UsuarioResponse> toListReponse(List<Usuario> users);
}
