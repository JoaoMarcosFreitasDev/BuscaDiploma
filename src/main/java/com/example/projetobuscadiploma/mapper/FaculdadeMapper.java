package com.example.projetobuscadiploma.mapper;

import com.example.projetobuscadiploma.dto.faculdade.FaculdadeRequest;
import com.example.projetobuscadiploma.dto.faculdade.FaculdadeResponse;
import com.example.projetobuscadiploma.model.Faculdade;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface FaculdadeMapper {

    FaculdadeMapper INSTANCE = Mappers.getMapper(FaculdadeMapper.class);

    FaculdadeResponse toDTO(Faculdade faculdade);
    Faculdade toEntity(FaculdadeRequest request);
    List<FaculdadeResponse> listResponse (List<Faculdade> faculdades);

}
