package com.example.projetobuscadiploma.model;

import com.example.projetobuscadiploma.enums.Modalidade;
import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
public class Curso {

    private int id;
    private int faculdadeId;
    private String nameCurso;
    private int durationYears;
    private Modalidade modalidade;
    private String linkCurso;
}
