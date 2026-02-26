package com.example.projetobuscadiploma.dto.usuario;

import com.example.projetobuscadiploma.enums.RedeSocial;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class UsuarioResponse {

    private int id;
    private String nomeCompleto;
    private String nomeUsuario;
    private String email;
    private String password;
    private String telefone;
    private String urlPerfilFoto;
    private String instagram;
    private String facebook;
}
