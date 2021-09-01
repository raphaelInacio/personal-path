package br.com.alura.escola;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    @Test
    public void naoDeveAceitarEmailInvalido() {
        assertThrows(IllegalArgumentException.class, () -> new Email(null));
        assertThrows(IllegalArgumentException.class, () -> new Email("raphaelinacio.com"));
        assertThrows(IllegalArgumentException.class, () -> new Email(""));
    }

    @Test
    public void deveCadastrarUmEmailValido() {
        assertNotNull(new Email("contato.raphaelinacio@gmail.com"));
    }

}