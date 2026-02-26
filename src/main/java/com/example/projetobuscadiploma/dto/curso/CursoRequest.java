package com.example.projetobuscadiploma.dto.curso;

import com.example.projetobuscadiploma.enums.Modalidade;
import jakarta.persistence.Column;
import lombok.Data;

@Data
public class CursoRequest {

    private int faculdadeId;
    private String nameCurso;
    private int durationYears;
    private Modalidade modalidade;
    private String linkCurso;
    private double notaMec;
    private String describe;
}
