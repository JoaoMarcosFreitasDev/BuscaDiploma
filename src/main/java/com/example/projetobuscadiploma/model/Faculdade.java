package com.example.projetobuscadiploma.model;

import com.example.projetobuscadiploma.enums.RedeSocial;
import com.example.projetobuscadiploma.enums.TipoInstituicao;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@Entity
@Table(name = "Faculdade")
@NoArgsConstructor
@AllArgsConstructor
public class Faculdade {

    @Id
    @Column(name = "IdFaculdade")
    private int id;
    @Column(name = "NomeFantasia")
    private String nomeFantasia;
    @Column(name = "RazaoSocial")
    private String razaoSocial;
    @Column(name = "CNPJ")
    private String cnpj;
    @Column(name = "Descricao")
    private String descricao;
    @Column(name = "SiteOficial")
    private String siteOficial;

    @Enumerated(EnumType.STRING)
    @Column(name = "TipoInstituicao")
    private TipoInstituicao tipoInstituicao;
    @Column(name = "TelefoneSuporte")
    private String telefoneSuporte;
    @Column(name = "Email")
    private String email;
    @Column(name = "UrlLogotipo")
    private String url;
    @Column(name = "Instagram")
    private String instagram;
    @Column(name = "Facebook")
    private String facebook;
    @Column(name = "NotaMec")
    private float notaMec;
    @Column(name = "QuantidadeCursos")
    private int quantidadeCursos;

}
