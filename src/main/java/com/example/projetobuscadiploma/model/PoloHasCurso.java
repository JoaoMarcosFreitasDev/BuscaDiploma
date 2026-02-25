package com.example.projetobuscadiploma.model;

import com.example.projetobuscadiploma.enums.Turno;
import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
public class PoloHasCurso {

    private int id;
    private int cursoId;
    private int poloId;
    private float mensalidade;
    private Turno turno;
    private int quantidadeVaga;
}
