package com.example.projetobuscadiploma.repository;

import com.example.projetobuscadiploma.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
