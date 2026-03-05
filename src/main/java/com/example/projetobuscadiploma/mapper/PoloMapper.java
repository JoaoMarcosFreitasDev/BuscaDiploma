package com.example.projetobuscadiploma.mapper;

import com.example.projetobuscadiploma.dto.polo.PoloRequest;
import com.example.projetobuscadiploma.dto.polo.PoloResponse;
import com.example.projetobuscadiploma.model.Polo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PoloMapper {

    PoloMapper INSTANCE = Mappers.getMapper(PoloMapper.class);

    PoloResponse toDTO(Polo polo);
    List<PoloResponse> listResponse (List<Polo> polos);
}
