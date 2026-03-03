package com.example.projetobuscadiploma.service;

import com.example.projetobuscadiploma.dto.polo.PoloRequest;
import com.example.projetobuscadiploma.dto.polo.PoloResponse;
import com.example.projetobuscadiploma.mapper.PoloMapper;
import com.example.projetobuscadiploma.model.Faculdade;
import com.example.projetobuscadiploma.model.Polo;
import com.example.projetobuscadiploma.repository.FaculdadeRepository;
import com.example.projetobuscadiploma.repository.PoloRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;

@Service
@RequiredArgsConstructor
public class PoloService {

    private final PoloRepository repository;
    private final FaculdadeRepository faculdadeRepository;

    public PoloResponse salvar(PoloRequest request){
        return PoloMapper.INSTANCE.toDTO(repository.save(buildRequest(request, faculdadeRepository)));
    }

    public PoloResponse findById(int id){
        return PoloMapper.INSTANCE
                .toDTO(repository
                        .findById(id)
                        .orElseThrow(() -> new EntityNotFoundException("Polo not found!")));
    }

    public List<PoloResponse> findAll(){
        return PoloMapper.INSTANCE.listResponse(repository.findAll());
    }

    public void delete(int id){
        repository.deleteById(id);
    }

    public PoloResponse update(int id, PoloRequest request){
        Polo polo = buildRequest(request, faculdadeRepository);
        polo.setId(id);
        return PoloMapper.INSTANCE.toDTO(repository.save(polo));
    }


    public Polo buildRequest(PoloRequest request, FaculdadeRepository repository){
        Optional<Faculdade> faculdade = repository.findById(request.getFaculdade());

        return Polo.builder()
                .faculdade(faculdade.get())
                .cep(request.getCep())
                .estado(request.getEstado())
                .bairro(request.getBairro())
                .cidade(request.getCidade())
                .endereco(request.getEndereco())
                .name(request.getName())
                .number(request.getNumber())
                .latitude(request.getLatitude())
                .longitude(request.getLongitude())
                .build();

    }
}
