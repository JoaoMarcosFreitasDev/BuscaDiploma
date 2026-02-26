package com.example.projetobuscadiploma.model;

import com.example.projetobuscadiploma.enums.Modalidade;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Entity
@Table(name = "Curso")
@NoArgsConstructor
@AllArgsConstructor
public class Curso {

    @Id
    @Column(name = "IdCurso", insertable = false, updatable = false)
    private int id;
    @Column(name = "IdFaculdade")
    private int faculdadeId;
    @Column(name = "NomeCurso")
    private String nameCurso;
    @Column(name = "Descricao")
    private String describe;
    @Column(name = "DuracaoSemestres")
    private int durationSemesters;
    @Column(name = "Modalidade")
    private Modalidade modalidade;
    @Column(name = "NotaMec")
    private double notaMec;
    @Column(name = "IdCurso")
    private String linkCurso;
}
