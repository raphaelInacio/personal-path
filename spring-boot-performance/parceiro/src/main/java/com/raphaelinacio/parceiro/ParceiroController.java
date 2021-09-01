package com.raphaelinacio.parceiro;

import org.apache.coyote.http11.filters.VoidOutputFilter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Random;

@RestController
@RequestMapping("/v1/parceiros")
public class ParceiroController {

    private static Long confiTimeout = 1000L;

    @GetMapping
    public ResponseEntity<EmpresasParceiras> listar() throws InterruptedException {

        Long timeoutRandomico = new Random().nextBoolean() ? confiTimeout : 3000L;

        System.out.println(">>>>>>>>>> Timout randomico de: " + timeoutRandomico);

        Thread.sleep(timeoutRandomico);

        EmpresasParceiras empresasParceiras = new EmpresasParceiras(Arrays.asList(
                new ParceiroDomain("Restaurante Mineiro"),
                new ParceiroDomain("Restaurante Italiano"),
                new ParceiroDomain("Rodizio Gaucho")));

        return ResponseEntity.ok(empresasParceiras);
    }


    @GetMapping("/timeout/{timeout}")
    public void listar(@PathVariable("timeout") Long timeout) throws InterruptedException {
        confiTimeout = timeout;
    }
}
