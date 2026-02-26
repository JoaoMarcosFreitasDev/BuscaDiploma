package com.example.projetobuscadiploma.dto.response;

import com.example.projetobuscadiploma.enums.Estado;
import com.example.projetobuscadiploma.model.Curso;
import com.example.projetobuscadiploma.model.Faculdade;

import java.util.List;

public class PoloResponse {

    private int id;
    private Faculdade faculdade;
    private String name;
    private Estado estado;
    private String cidade;
    private String bairro;
    private String cep;
    private String number;
    private double latitude;
    private double longitude;
    private List<Curso> cursos;
}
