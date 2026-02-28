package com.example.projetobuscadiploma.model;

import com.example.projetobuscadiploma.enums.Modalidade;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

@Data
@Builder
@Entity
@Table(name = "Curso")
@NoArgsConstructor
@AllArgsConstructor
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdCurso", insertable = false, updatable = false)
    private int id;
    @ManyToOne
    @JoinColumn(name = "IdFaculdade", referencedColumnName = "IdFaculdade", nullable = false)
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private Faculdade idFaculdade;
    @Column(name = "NomeCurso")
    private String nameCurso;
    @Column(name = "Descricao")
    private String describe;
    @Column(name = "DuracaoSemestres")
    private int durationSemesters;
    @Enumerated(EnumType.STRING)
    @Column(name = "Modalidade")
    private Modalidade modalidade;
    @Column(name = "NotaMec")
    private double notaMec;
    @Column(name = "LinkInformacoes")
    private String linkCurso;
}
