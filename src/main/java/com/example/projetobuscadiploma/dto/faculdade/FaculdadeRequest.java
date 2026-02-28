package com.example.projetobuscadiploma.dto.faculdade;

import com.example.projetobuscadiploma.enums.RedeSocial;
import com.example.projetobuscadiploma.enums.TipoInstituicao;
import lombok.Data;
import lombok.ToString;


@Data
@ToString
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
    private float notaMec;
    private int quantidadeCursos;
    private String instagram;
    private String facebook;
}
