package br.com.alura.escola;

import java.util.HashSet;
import java.util.Set;

public class Aluno {
    private String nome;
    private CPF cpf;
    private Email email;
    private Set<Telefone> telefones = new HashSet<>();

    public void adicionaTelefone(String ddd, String numero) {
        this.telefones.add(new Telefone(ddd, numero));

    }
}
