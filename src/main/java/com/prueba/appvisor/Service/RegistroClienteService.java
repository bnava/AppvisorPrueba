package com.prueba.appvisor.Service;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.opencsv.CSVWriter;
import com.prueba.appvisor.Utils.PropertiesFile;
import com.prueba.appvisor.domain.ClienteRegistro;

@Service
public class RegistroClienteService {

    @Autowired
    private PropertiesFile propsFile;

    public Object registroCliente(ClienteRegistro registro) {
        try {
            CSVWriter writer = new CSVWriter(new FileWriter(propsFile.getRuta_csv(), true));
            String[] filaStrings = new String[8];
            Date date = new Date();
            filaStrings[0] = registro.getID_PERSONA();
            filaStrings[1] = registro.getNOMBRE_CNBV();
            filaStrings[2] = "";
            filaStrings[3] = "";
            filaStrings[4] = "";
            filaStrings[5] = "";
            filaStrings[6] = registro.getINGRESOS_MENSUALES();
            filaStrings[7] = new SimpleDateFormat("dd-MM-yyyy").format(date);
            writer.writeNext(filaStrings);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            return "Ocurrio un error al insertar";
        }
        return "Se inserto correctamente";
    }
}
