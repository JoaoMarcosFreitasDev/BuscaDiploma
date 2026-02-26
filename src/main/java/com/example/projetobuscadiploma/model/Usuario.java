package com.example.projetobuscadiploma.model;


import com.example.projetobuscadiploma.enums.RedeSocial;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@Entity
@Table(name = "Usuario")
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdUsuario")
    private int id;
    @Column(name = "NomeCompleto")
    private String nomeCompleto;
    @Column(name = "NomeUsuario")
    private String nomeUsuario;
    @Column(name = "Email")
    private String email;
    @Column(name = "Senha")
    private String password;
    @Column(name = "Telefone")
    private String telefone;
    @Column(name = "UrlFotoPerfil")
    private String urlPerfilFoto;
    @Column(name = "Instagram")
    private String instagram;
    @Column(name = "Facebook")
    private String facebook;

}
