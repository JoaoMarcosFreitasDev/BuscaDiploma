package com.example.projetobuscadiploma.dto.request;

import com.example.projetobuscadiploma.enums.Modalidade;
import com.example.projetobuscadiploma.model.Faculdade;
import lombok.Data;

@Data
public class CursoRequest {

    private int faculdadeId;
    private String nameCurso;
    private int durationYears;
    private Modalidade modalidade;
    private String linkCurso;
}
