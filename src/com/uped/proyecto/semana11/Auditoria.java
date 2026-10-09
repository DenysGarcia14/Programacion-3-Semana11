package com.uped.proyecto.semana11;

public interface Auditoria {
    default String etiqueta() {
        return "AUD";
    }
}