package com.example.projetobuscadiploma.model;

import com.example.projetobuscadiploma.enums.Estado;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@Entity
@Table(name = "Polo")
@NoArgsConstructor
@AllArgsConstructor
public class Polo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdPolo")
    private int id;
    @OneToOne
    @JoinColumn(name = "IdFaculdade", referencedColumnName = "IdFaculdade", nullable = false)
    private Faculdade faculdade;
    @Column(name = "NomePolo")
    private String name;
    @Column(name = "Endereco")
    private String endereco;
    @Column(name = "Estado")
    private Estado estado;
    @Column(name = "Cidade")
    private String cidade;
    @Column(name = "Bairro")
    private String bairro;
    @Column(name = "Cep")
    private String cep;
    @Column(name = "Telefone")
    private String number;
    @Column(name = "Latitude")
    private double latitude;
    @Column(name = "Longitude")
    private double longitude;

//    @Column(name = "IdPolo")
//    private List<Curso> cursos;
}
