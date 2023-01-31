package com.prueba.appvisor.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.prueba.appvisor.Constants.Status;
import com.prueba.appvisor.Response.ApiResponse;
import com.prueba.appvisor.Service.ObtenerIngresosService;

@RestController
public class ObtenerIngresosController {

    @Autowired
    private ObtenerIngresosService ob;

    @PostMapping(value = "/obteneringresos")
    @ResponseBody
    public Object obtenerIngresosMensuales(@RequestParam("ingreso") double ingreso) {

        Object jsonResp = ob.obtenerIngresoService(ingreso);
        return new ApiResponse(Status.OK, jsonResp);
    }
}
