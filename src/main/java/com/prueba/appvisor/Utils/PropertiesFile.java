package com.prueba.appvisor.Utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@PropertySource("classpath:application.properties")
@Data
public class PropertiesFile {

	@Value("${clientes.url.csv}")
	private String ruta_csv;
}
