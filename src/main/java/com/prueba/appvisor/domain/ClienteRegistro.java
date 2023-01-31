package com.prueba.appvisor.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ClienteRegistro {
    private String ID_PERSONA;
    private String NOMBRE_CNBV;
    private String INGRESOS_MENSUALES;
}
