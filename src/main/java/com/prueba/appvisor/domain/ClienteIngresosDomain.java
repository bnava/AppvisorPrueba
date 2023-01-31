package com.prueba.appvisor.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ClienteIngresosDomain {

    private String ID_PERSONA;
    private String LOCALIDAD;
    private String ACTIVIDAD_ECONOMICA;
    private String GRUPO_RIESGO_COMUN;
    private String INGRESOS_MENSUALES;

}
