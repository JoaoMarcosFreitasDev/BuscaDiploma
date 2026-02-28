package com.example.projetobuscadiploma.controller;


import com.example.projetobuscadiploma.dto.curso.CursoRequest;
import com.example.projetobuscadiploma.dto.curso.CursoResponse;
import com.example.projetobuscadiploma.service.CursoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/curso")
@Log4j2
@RequiredArgsConstructor
public class CursoController {

    private final CursoService service;

    @PostMapping
    public CursoResponse create(@RequestBody CursoRequest request){
        return service.createCurso(request);
    }

    @GetMapping
    public List<CursoResponse> listAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public CursoResponse findById(@PathVariable int id){
        return service.findById(id);
    }

    @PutMapping("/{id}")
    public CursoResponse update(@PathVariable int id, @RequestBody CursoRequest request){
        return service.update(id, request);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        service.delete(id);
    }
}
