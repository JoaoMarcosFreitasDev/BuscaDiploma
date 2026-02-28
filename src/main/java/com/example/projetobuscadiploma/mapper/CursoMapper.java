package com.example.projetobuscadiploma.mapper;

import com.example.projetobuscadiploma.dto.curso.CursoRequest;
import com.example.projetobuscadiploma.dto.curso.CursoResponse;
import com.example.projetobuscadiploma.model.Curso;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CursoMapper {

    CursoMapper INSTANCE = Mappers.getMapper(CursoMapper.class);

    CursoResponse toDTO(Curso curso);
    Curso toEntity(CursoRequest request);
    List<CursoResponse> listResponseDTO (List<Curso> cursos);
}
