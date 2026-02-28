package com.example.projetobuscadiploma.controller;


import com.example.projetobuscadiploma.dto.faculdade.FaculdadeRequest;
import com.example.projetobuscadiploma.dto.faculdade.FaculdadeResponse;
import com.example.projetobuscadiploma.repository.FaculdadeRepository;
import com.example.projetobuscadiploma.service.FaculdadeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/faculdade")
@Log4j2
@RequiredArgsConstructor
public class FaculdadeController {

    private final FaculdadeService service;

    @PostMapping
    public FaculdadeResponse create(@RequestBody FaculdadeRequest request){
        return service.save(request);
    }

    @GetMapping
    public List<FaculdadeResponse> listAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public FaculdadeResponse findById(@PathVariable int id){
        return service.findById(id);
    }

    @PutMapping("/{id}")
    public FaculdadeResponse update(@PathVariable int id, @RequestBody FaculdadeRequest request){
        return service.update(id, request);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        service.delete(id);
    }

}
