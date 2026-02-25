package com.example.projetobuscadiploma.model;

import com.example.projetobuscadiploma.enums.RedeSocial;
import com.example.projetobuscadiploma.enums.TipoInstituicao;
import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@Entity
public class Faculdade {

    private int id;
    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;
    private String descricao;
    private String siteOficial;
    private TipoInstituicao tipoInstituicao;
    private String telefoneSuporte;
    private String email;
    private String url;
    private List<RedeSocial> redeSocials;
    private double notaMec;
    private int quantidadeCursos;

}
