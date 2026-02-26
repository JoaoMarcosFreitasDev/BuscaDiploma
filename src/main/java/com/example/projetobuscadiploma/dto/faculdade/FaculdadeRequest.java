package com.example.projetobuscadiploma.dto.request;

import com.example.projetobuscadiploma.enums.RedeSocial;
import com.example.projetobuscadiploma.enums.TipoInstituicao;

import java.util.List;

public class FaculdadeRequest {
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
