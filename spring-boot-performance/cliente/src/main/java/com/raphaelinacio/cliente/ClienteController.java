package com.raphaelinacio.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/clientes")
public class ClienteController {

    @Autowired
    private EmpresasParceirasService empresasParceirasService;

    @GetMapping
    public ResponseEntity<ClienteDomain> listar() {
        EmpresasParceiras empresasParceiras = empresasParceirasService.listar();
        return ResponseEntity.ok(new ClienteDomain("Cliente 1", empresasParceiras.getEmpresasParceiras()));
    }
}
