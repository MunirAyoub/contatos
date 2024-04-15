package br.com.fiap.contatos.dto.response;

import lombok.Builder;

import java.time.LocalDate;

@Builder
public record PessoaResponse(
        String nome,
        String sobrenome,
        LocalDate nascimento,
        String username,
        String password
) {
}
