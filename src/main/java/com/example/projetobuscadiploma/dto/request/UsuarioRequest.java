package com.example.projetobuscadiploma.dto.request;

import com.example.projetobuscadiploma.enums.RedeSocial;

import java.util.List;

public class UsuarioRequest {

    private String nomeCompleto;
    private String nomeUsuario;
    private String email;
    private String password;
    private String telefone;
    private String urlPerfilFoto;
    private List<RedeSocial> redeSocials;
}
