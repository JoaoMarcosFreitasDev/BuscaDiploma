package com.example.projetobuscadiploma.service;

import com.example.projetobuscadiploma.dto.curso.CursoRequest;
import com.example.projetobuscadiploma.dto.curso.CursoResponse;
import com.example.projetobuscadiploma.exception.ErrorServerException;
import com.example.projetobuscadiploma.exception.NotFoundException;
import com.example.projetobuscadiploma.mapper.CursoMapper;
import com.example.projetobuscadiploma.model.Curso;
import com.example.projetobuscadiploma.model.Faculdade;
import com.example.projetobuscadiploma.repository.CursoRepository;
import com.example.projetobuscadiploma.repository.FaculdadeRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ServerErrorException;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CursoService {

    @Autowired
    private final CursoRepository cursoRepository;

    @Autowired
    private final FaculdadeRepository repository;

    @Transactional
    public CursoResponse createCurso(CursoRequest cursoRequest){
        try {
            Faculdade faculdade = repository.findById(cursoRequest.getFaculdadeId())
                    .orElseThrow(() -> new EntityNotFoundException("Faculty not found."));
            Curso cursoCreated = cursoRepository.save(returnCurso(faculdade, cursoRequest));
            return CursoMapper.INSTANCE.toDTO(cursoCreated);
        }catch (ErrorServerException e){
            throw new ErrorServerException();
        }
    }

    @Transactional
    public CursoResponse findById(int id){
        try {
            return CursoMapper.INSTANCE.toDTO(cursoRepository.findById(id)
                    .orElseThrow(() -> new EntityNotFoundException("Course not Found")));
        }catch (NotFoundException e){
            throw new NotFoundException("Course linked for the id not found");
        }
    }

    @Transactional
    public List<CursoResponse> findAll() throws NotFoundException{

        return CursoMapper.INSTANCE
                .listResponseDTO(cursoRepository.findAll());

    }

    @Transactional
    public CursoResponse update(int id, CursoRequest request){
        Faculdade faculdade =
                repository.findById(request.getFaculdadeId())
                        .orElseThrow(() -> new EntityNotFoundException("Faculti not exists, verify idFaculty"));

        Curso curso = returnCurso(faculdade, request);
        curso.setId(id);
        return CursoMapper.INSTANCE.toDTO(cursoRepository.save(curso));

    }

    @Transactional
    public void delete(int id){
        cursoRepository.deleteById(id);
    }




    /**
     * Analisar depois a lógica de como está a vinculação com o id da faculdade.
     * @param cursoRequest
     * @return
     */
    public Curso returnCurso(Faculdade faculdade, CursoRequest cursoRequest){
        return Curso.builder()
                .nameCurso(cursoRequest.getNameCurso())
                .linkCurso(cursoRequest.getLinkCurso())
                .durationSemesters(cursoRequest.getDurationYears())
                .idFaculdade(faculdade)
                .modalidade(cursoRequest.getModalidade())
                .notaMec(cursoRequest.getNotaMec())
                .describe(cursoRequest.getDescribe())
                .build();
    }

}
