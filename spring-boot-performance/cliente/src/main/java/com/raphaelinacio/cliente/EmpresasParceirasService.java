package com.raphaelinacio.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class EmpresasParceirasService {

    @Autowired
    private RestTemplate restTemplate;

    public EmpresasParceiras listar() {
        ResponseEntity<EmpresasParceiras> empresasParceiras = restTemplate.getForEntity("http://localhost:8080/v1/parceiros", EmpresasParceiras.class);
        return empresasParceiras.getBody();
    }
}
