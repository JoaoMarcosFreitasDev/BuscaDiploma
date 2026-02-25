package com.example.projetobuscadiploma.model;


import com.example.projetobuscadiploma.enums.RedeSocial;
import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@Entity
public class Usuario {

    private int id;
    private String nomeCompleto;
    private String nomeUsuario;
    private String email;
    private String password;
    private String telefone;
    private String urlPerfilFoto;
    private List<RedeSocial> redeSocials;

}
