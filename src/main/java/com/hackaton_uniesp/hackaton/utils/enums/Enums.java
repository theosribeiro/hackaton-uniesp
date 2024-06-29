package com.hackaton_uniesp.hackaton.utils.enums;

import lombok.Getter;

public class Enums {

    @Getter
    public enum TipoUsuario {
        ADMIN(""),
        CLIENT("");

        private final String tipoUsuario;

        TipoUsuario(String tipoUsuario) {
            this.tipoUsuario = tipoUsuario;
        }
    }
}
