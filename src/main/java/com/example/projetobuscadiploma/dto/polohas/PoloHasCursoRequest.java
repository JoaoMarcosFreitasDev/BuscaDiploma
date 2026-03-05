package com.example.projetobuscadiploma.dto.polohas;

import com.example.projetobuscadiploma.enums.Turno;
import lombok.Data;

@Data
public class PoloHasCursoRequest {

    private int cursoId;
    private int poloId;
    private float mensalidade;
    private Turno turno;
    private int quantidadeVaga;
}
