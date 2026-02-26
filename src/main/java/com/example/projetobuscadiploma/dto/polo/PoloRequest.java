package com.example.projetobuscadiploma.dto.polo;

import com.example.projetobuscadiploma.enums.Estado;
import com.example.projetobuscadiploma.model.Curso;
import com.example.projetobuscadiploma.model.Faculdade;

import java.util.List;

public class PoloRequest {

    private Faculdade faculdade;
    private String name;
    private String endereco;
    private Estado estado;
    private String cidade;
    private String bairro;
    private String cep;
    private String number;
    private double latitude;
    private double longitude;
//    private List<Curso> cursos;
}
