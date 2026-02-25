package com.example.projetobuscadiploma.service;

import com.example.projetobuscadiploma.dto.request.CursoRequest;
import com.example.projetobuscadiploma.dto.response.CursoResponse;
import com.example.projetobuscadiploma.model.Curso;
import com.example.projetobuscadiploma.repository.CursoRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CursoService {

    @Autowired
    private final CursoRepository cursoRepository;

    public CursoResponse createCurso(CursoRequest cursoRequest){
        Curso cursoCreated = cursoRepository.save(returnCurso(cursoRequest));
        return reponse(cursoCreated);
    }


    public Curso returnCurso(CursoRequest cursoRequest){
        return Curso.builder()
                .nameCurso(cursoRequest.getNameCurso())
                .linkCurso(cursoRequest.getLinkCurso())
                .durationYears(cursoRequest.getDurationYears())
                .faculdadeId(cursoRequest.getFaculdadeId())
                .modalidade(cursoRequest.getModalidade())
                .build();
    }

    public CursoResponse reponse(Curso curso){
        return CursoResponse.builder()
                .id(curso.getId())
                .nameCurso(curso.getNameCurso())
                .durationYears(curso.getDurationYears())
                .faculdadeId(curso.getFaculdadeId())
                .linkCurso(curso.getLinkCurso())
                .modalidade(curso.getModalidade())
                .build();
    }
}
