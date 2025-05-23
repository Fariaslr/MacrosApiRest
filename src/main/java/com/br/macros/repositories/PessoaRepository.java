package com.br.macros.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.macros.models.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, UUID>{
	Optional<Pessoa> findByEmail(String email);

}
