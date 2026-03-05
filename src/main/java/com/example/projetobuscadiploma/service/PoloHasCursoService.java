package com.example.projetobuscadiploma.service;

import com.example.projetobuscadiploma.dto.polohas.PoloHasCursoRequest;
import com.example.projetobuscadiploma.dto.polohas.PoloHasCursoResponse;
import com.example.projetobuscadiploma.mapper.PoloHasCursoMapper;
import com.example.projetobuscadiploma.mapper.modelmapper.ModelMapperConfig;
import com.example.projetobuscadiploma.model.Curso;
import com.example.projetobuscadiploma.model.Polo;
import com.example.projetobuscadiploma.model.PoloHasCurso;
import com.example.projetobuscadiploma.repository.CursoRepository;
import com.example.projetobuscadiploma.repository.PoloHasCursoRepository;
import com.example.projetobuscadiploma.repository.PoloRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class PoloHasCursoService {

    private final PoloHasCursoRepository repository;
    private final CursoRepository cursoRepository;
    private PoloRepository poloRepository;
    private final ModelMapperConfig mapperConfig;

    @Transactional
    public PoloHasCursoResponse save(PoloHasCursoRequest request){
        return PoloHasCursoMapper.INSTANCE.toDTO(repository.save(buildRequest(request)));
    }






    public PoloHasCurso buildRequest(PoloHasCursoRequest request){

        Polo polo = poloRepository.findById(request.getPoloId())
                .orElseThrow(() -> new EntityNotFoundException("Polo not found in the database"));

        Curso curso = cursoRepository.findById(request.getCursoId())
                .orElseThrow(() -> new EntityNotFoundException("Course not found in the database"));

        return PoloHasCurso.builder()
                .cursoId(curso)
                .poloId(polo)
                .turno(request.getTurno())
                .mensalidade(request.getMensalidade())
                .quantidadeVaga(request.getQuantidadeVaga())
                .build();
    }

}
