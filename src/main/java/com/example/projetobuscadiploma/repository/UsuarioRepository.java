package com.example.projetobuscadiploma.repository;

import com.example.projetobuscadiploma.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
