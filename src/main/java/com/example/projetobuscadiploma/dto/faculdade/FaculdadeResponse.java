package com.example.projetobuscadiploma.dto.faculdade;

import com.example.projetobuscadiploma.enums.RedeSocial;
import com.example.projetobuscadiploma.enums.TipoInstituicao;
import lombok.Builder;
import lombok.Data;

import java.util.List;
@Data
@Builder
public class FaculdadeResponse {
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
    private String instagram;
    private String facebook;
    private float notaMec;
    private int quantidadeCursos;
}
