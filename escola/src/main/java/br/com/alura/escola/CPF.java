package br.com.alura.escola;

public class CPF {
    private String numero;

    public CPF(String numero) {
        if (numero == null || numero.matches("^\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}$/"))
            this.numero = numero;
    }
}
