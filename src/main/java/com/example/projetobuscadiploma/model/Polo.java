package com.example.projetobuscadiploma.model;

import com.example.projetobuscadiploma.enums.Estado;

import java.util.List;

public class Polo {

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
