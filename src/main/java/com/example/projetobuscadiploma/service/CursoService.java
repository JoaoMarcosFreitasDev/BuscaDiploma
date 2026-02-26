package com.example.projetobuscadiploma.service;

import com.example.projetobuscadiploma.dto.curso.CursoRequest;
import com.example.projetobuscadiploma.dto.curso.CursoResponse;
import com.example.projetobuscadiploma.model.Curso;
import com.example.projetobuscadiploma.repository.CursoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class CursoService {

    @Autowired
    private final CursoRepository cursoRepository;

    @Transactional
    public CursoResponse createCurso(CursoRequest cursoRequest){
        Curso cursoCreated = cursoRepository.save(returnCurso(cursoRequest));
        return reponse(cursoCreated);
    }


    /**
     * Analisar depois a lógica de como está a vinculação com o id da faculdade.
     * @param cursoRequest
     * @return
     */
    public Curso returnCurso(CursoRequest cursoRequest){
        return Curso.builder()
                .nameCurso(cursoRequest.getNameCurso())
                .linkCurso(cursoRequest.getLinkCurso())
                .durationSemesters(cursoRequest.getDurationYears())
                .faculdadeId(cursoRequest.getFaculdadeId())
                .modalidade(cursoRequest.getModalidade())
                .notaMec(cursoRequest.getNotaMec())
                .describe(cursoRequest.getDescribe())
                .build();
    }

    public CursoResponse reponse(Curso curso){
        return CursoResponse.builder()
                .id(curso.getId())
                .nameCurso(curso.getNameCurso())
                .durationYears(curso.getDurationSemesters())
                .faculdadeId(curso.getFaculdadeId())
                .linkCurso(curso.getLinkCurso())
                .modalidade(curso.getModalidade())
                .build();
    }
}
