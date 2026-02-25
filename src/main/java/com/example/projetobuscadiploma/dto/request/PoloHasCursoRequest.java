package com.example.projetobuscadiploma.dto.request;

import com.example.projetobuscadiploma.enums.Turno;

public class PoloHasCursoRequest {

    private int cursoId;
    private int poloId;
    private float mensalidade;
    private Turno turno;
    private int quantidadeVaga;
}
