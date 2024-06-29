package com.hackaton_uniesp.hackaton.marjosports.dto;

import com.hackaton_uniesp.hackaton.utils.enums.Enums.TipoUsuario;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private Long id;
    @Size(min = 11, max = 11, message = "CPF deve ser válido")
    private String cpf;
    @Email(message = "E-mail deve ser válido")
    private String email;
    private String nome;
    private String senha;
    private String login;
    private TipoUsuario tipoUsuario;

}
