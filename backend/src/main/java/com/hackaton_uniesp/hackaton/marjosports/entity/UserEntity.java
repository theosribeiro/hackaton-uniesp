package com.hackaton_uniesp.hackaton.marjosports.entity;

import com.hackaton_uniesp.hackaton.utils.enums.Enums.TipoUsuario;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false)
    private String cpf;
    @Column(unique = true, nullable = false)
    private String email;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String senha;
    @Column(unique = true, nullable = false)
    private String login;
    @Column(nullable = false)
    private TipoUsuario tipoUsuario;
}
