package com.example.projetobuscadiploma.model;

import com.example.projetobuscadiploma.enums.Turno;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Entity
@Table(name = "Polo_has_Curso")
@NoArgsConstructor
@AllArgsConstructor
public class PoloHasCurso {

    @Id
    @Column(name = "IdPoloHasCurso")
    private int id;
    @Column(name = "IdCurso")
    private int cursoId;
    @Column(name = "IdPolo")
    private int poloId;
    @Column(name = "Mensalidade")
    private float mensalidade;

    @Enumerated(EnumType.STRING)
    @Column(name = "Turno")
    private Turno turno;
    @Column(name = "QuantidadeVagas")
    private int quantidadeVaga;
}
