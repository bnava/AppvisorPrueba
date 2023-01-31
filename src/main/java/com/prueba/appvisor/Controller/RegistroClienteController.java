package com.prueba.appvisor.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.appvisor.Constants.Status;
import com.prueba.appvisor.Response.ApiResponse;
import com.prueba.appvisor.Service.RegistroClienteService;
import com.prueba.appvisor.domain.ClienteRegistro;

@RestController
public class RegistroClienteController {
    @Autowired
    RegistroClienteService registroCliente;

    @PostMapping(value = "/registrocliente")
    @ResponseBody
    public Object obtenerIngresosMensuales(@RequestBody ClienteRegistro registro) {

        Object jsonResp = registroCliente.registroCliente(registro);
        return new ApiResponse(Status.OK, jsonResp);
    }
}
