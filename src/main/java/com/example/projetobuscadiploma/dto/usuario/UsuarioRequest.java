package com.example.projetobuscadiploma.dto.usuario;

import com.example.projetobuscadiploma.enums.RedeSocial;
import lombok.Data;

import java.util.List;

@Data
public class UsuarioRequest {

    private String nomeCompleto;
    private String nomeUsuario;
    private String email;
    private String password;
    private String telefone;
    private String urlPerfilFoto;
    private String instagram;
    private String facebook;
}
