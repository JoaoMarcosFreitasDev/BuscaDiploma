package com.example.projetobuscadiploma.dto.curso;

import com.example.projetobuscadiploma.enums.Modalidade;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CursoResponse {

    private int id;
    private int faculdadeId;
    private String nameCurso;
    private int durationYears;
    private Modalidade modalidade;
    private String linkCurso;
    private double notaMec;
    private String describe;
}
