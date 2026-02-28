package com.example.projetobuscadiploma.service;

import com.example.projetobuscadiploma.dto.faculdade.FaculdadeRequest;
import com.example.projetobuscadiploma.dto.faculdade.FaculdadeResponse;
import com.example.projetobuscadiploma.mapper.FaculdadeMapper;
import com.example.projetobuscadiploma.model.Faculdade;
import com.example.projetobuscadiploma.repository.FaculdadeRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor

public class FaculdadeService {

    @Autowired
    private final FaculdadeRepository repository;

    @Transactional
    public FaculdadeResponse save(FaculdadeRequest request){
        return FaculdadeMapper.INSTANCE.toDTO(repository.save(buildRequest(request)));
    }

    @Transactional
    public FaculdadeResponse update(int id, FaculdadeRequest request){
        Faculdade faculdade = buildRequest(request);
        faculdade.setId(id);
        return FaculdadeMapper.INSTANCE.toDTO(repository.save(faculdade));
    }

    @Transactional
    public FaculdadeResponse findById(int id){
        return FaculdadeMapper.INSTANCE
                .toDTO(repository.findById(id)
                        .orElseThrow(() -> new EntityNotFoundException("Faculty not found")));
    }

    @Transactional
    public List<FaculdadeResponse> findAll(){
        return FaculdadeMapper.INSTANCE.listResponse(repository.findAll());
    }

    @Transactional
    public void delete(int id){
        repository.deleteById(id);
    }




    public Faculdade buildRequest(FaculdadeRequest request){
        return Faculdade.builder()
                .cnpj(request.getCnpj())
                .email(request.getEmail())
                .descricao(request.getDescricao())
                .facebook(request.getFacebook())
                .url(request.getUrl())
                .notaMec(request.getNotaMec())
                .nomeFantasia(request.getNomeFantasia())
                .quantidadeCursos(request.getQuantidadeCursos())
                .razaoSocial(request.getRazaoSocial())
                .siteOficial(request.getSiteOficial())
                .telefoneSuporte(request.getTelefoneSuporte())
                .tipoInstituicao(request.getTipoInstituicao())
                .instagram(request.getInstagram())
                .build();
    }


}
