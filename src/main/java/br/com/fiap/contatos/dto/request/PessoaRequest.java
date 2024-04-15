package br.com.fiap.contatos.dto.request;

import jakarta.validation.constraints.*;

import java.time.LocalDate;

public record PessoaRequest(
        @Size(min = 2, max = 25)
        @NotNull(message = "Nome é obrigatorio!")
        String nome,
        @Size(min = 3, max = 255)
        String sobrenome,
        @NotNull(message = " Username ")
        @Email(message = "Email inválido")
        String username,
        @PastOrPresent(message = "Não pode ser data no futuro!")
        LocalDate nascimento,

        @Pattern(regexp = "/^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[$*&@#])[0-9a-zA-Z$*&@#]{8,}$/")
        String password



) {
}
