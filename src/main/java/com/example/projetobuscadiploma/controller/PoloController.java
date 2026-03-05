package com.example.projetobuscadiploma.controller;

import com.example.projetobuscadiploma.dto.polo.PoloRequest;
import com.example.projetobuscadiploma.dto.polo.PoloResponse;
import com.example.projetobuscadiploma.service.PoloService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/polos")
@Log4j2
@RequiredArgsConstructor
public class PoloController {

    private final PoloService service;

    @PostMapping
    public PoloResponse save(@RequestBody PoloRequest request){
        return service.salvar(request);
    }

    @GetMapping
    public List<PoloResponse> getAll(){
        List<PoloResponse> polos = service.findAll();
        return polos;
    }

    @GetMapping("/{id}")
    public PoloResponse findById(@PathVariable int id){
        return service.findById(id);
    }

    @PutMapping("/{id}")
    public PoloResponse update(@PathVariable int id, @RequestBody PoloRequest request){
        return service.update(id, request);
    }

    @PatchMapping("/{id}")
    public PoloResponse updatePartial(@PathVariable int id, @RequestBody PoloRequest request){
        return service.updateParcial(id, request);
    }

}
