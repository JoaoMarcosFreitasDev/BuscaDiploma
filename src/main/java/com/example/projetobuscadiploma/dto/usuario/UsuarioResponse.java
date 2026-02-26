package com.example.projetobuscadiploma.dto.response;

import com.example.projetobuscadiploma.enums.RedeSocial;

import java.util.List;

public class UsuarioResponse {

    private int id;
    private String nomeCompleto;
    private String nomeUsuario;
    private String email;
    private String password;
    private String telefone;
    private String urlPerfilFoto;
    private List<RedeSocial> redeSocials;
}
