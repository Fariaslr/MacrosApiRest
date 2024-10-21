package com.br.macros.records;

import java.util.Date;

import com.br.macros.enums.Sexo;

public record PessoaRecordDto(String nome, String sobrenome, Date dataNascimento, Sexo sexo) {

}
