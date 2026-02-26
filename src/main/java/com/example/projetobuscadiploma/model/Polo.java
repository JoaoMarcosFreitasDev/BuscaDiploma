package com.example.projetobuscadiploma.model;

import com.example.projetobuscadiploma.enums.Estado;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@Entity
@Table(name = "Faculdade")
@NoArgsConstructor
@AllArgsConstructor
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
