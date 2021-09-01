package com.raphaelinacio.cliente;

import java.util.List;

public class ClienteDomain {
    public String nome;
    public List<ParceiroDomain> empresasParceiras;

    public ClienteDomain(String nome, List<ParceiroDomain> empresasParceiras) {
        this.nome = nome;
        this.empresasParceiras = empresasParceiras;
    }
}
