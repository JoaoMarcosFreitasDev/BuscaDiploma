package com.example.projetobuscadiploma.controller;

import com.example.projetobuscadiploma.dto.usuario.UsuarioRequest;
import com.example.projetobuscadiploma.dto.usuario.UsuarioResponse;
import com.example.projetobuscadiploma.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
@Log4j2
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService userService;

    @PostMapping
    public UsuarioResponse createUser(@RequestBody UsuarioRequest user){
        return userService.create(user);
    }

    @GetMapping
    public List<UsuarioResponse> listAll(){
        return userService.listAll();
    }
}
