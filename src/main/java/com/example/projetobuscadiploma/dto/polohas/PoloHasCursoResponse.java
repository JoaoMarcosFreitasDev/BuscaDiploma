package com.example.projetobuscadiploma.dto.polohas;

import com.example.projetobuscadiploma.enums.Turno;
import com.example.projetobuscadiploma.model.Curso;
import com.example.projetobuscadiploma.model.Polo;
import lombok.Data;

@Data
public class PoloHasCursoResponse {

    private int id;
    private Curso cursoId;
    private Polo poloId;
    private float mensalidade;
    private Turno turno;
    private int quantidadeVaga;
}
