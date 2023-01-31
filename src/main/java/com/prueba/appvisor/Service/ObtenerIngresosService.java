package com.prueba.appvisor.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.FileReader;
import com.opencsv.CSVReader;
import com.prueba.appvisor.Utils.PropertiesFile;
import com.prueba.appvisor.domain.ClienteIngresosDomain;

@Service
public class ObtenerIngresosService {
    @Autowired
    private PropertiesFile propsFile;

    public Object obtenerIngresoService(double ingreso) {

        List<ClienteIngresosDomain> result = new ArrayList<>();
        try {
            CSVReader csvReader = new CSVReader(new FileReader(propsFile.getRuta_csv()));
            String[] fila = null;
            int count = 0;
            while ((fila = csvReader.readNext()) != null) {
                count++;
                if (count > 1 && Double.parseDouble(fila[6]) >= ingreso) {
                    result.add(new ClienteIngresosDomain(fila[0], fila[2], fila[4], fila[5], fila[6]));
                }
            }

            csvReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
