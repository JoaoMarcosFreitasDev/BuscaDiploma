package com.example.projetobuscadiploma.mapper;


import com.example.projetobuscadiploma.dto.polohas.PoloHasCursoRequest;
import com.example.projetobuscadiploma.dto.polohas.PoloHasCursoResponse;
import com.example.projetobuscadiploma.model.PoloHasCurso;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PoloHasCursoMapper {

    PoloHasCursoMapper INSTANCE = Mappers.getMapper(PoloHasCursoMapper.class);

    PoloHasCursoResponse toDTO(PoloHasCurso poloHasCurso);
    PoloHasCurso toEntity(PoloHasCursoRequest request);

    List<PoloHasCursoResponse> listResponse(List<PoloHasCurso> polosHasCourses);
}
