package com.hackaton_uniesp.hackaton.marjosports.entity;

import com.hackaton_uniesp.hackaton.utils.enums.Enums.TipoUsuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String cpf;
    @Column(unique = true)
    private String email;
    private String nome;
    private String senha;
    @Column(unique = true)
    private String login;
    private TipoUsuario tipoUsuario;
}