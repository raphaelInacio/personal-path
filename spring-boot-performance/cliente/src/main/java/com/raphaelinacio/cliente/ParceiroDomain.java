package com.raphaelinacio.cliente;

public class ParceiroDomain {

    public void setNome(String nome) {
        this.nome = nome;
    }

    private String nome;

    public ParceiroDomain() {
    }

    public String getNome() {
        return nome;
    }
}
