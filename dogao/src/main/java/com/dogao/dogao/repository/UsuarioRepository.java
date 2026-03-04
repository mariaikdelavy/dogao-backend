package com.dogao.dogao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dogao.dogao.model.Produto;

public interface UsuarioRepository extends JpaRepository<Produto, Long> {

}