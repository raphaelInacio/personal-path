import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import strategy.Orcamento;
import strategy.problema.CalculadoraDeImpostos;
import strategy.problema.TipoImpostoEnum;

import java.math.BigDecimal;

class CalculadoraDeImpostosTest {

    @Test
    void deveCalcularImposto() {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        Assertions.assertEquals(new BigDecimal("6.00"), calculadora.calcular(orcamento, TipoImpostoEnum.ICMS));
        Assertions.assertEquals(new BigDecimal("10.0"), calculadora.calcular(orcamento, TipoImpostoEnum.ISS));
    }

}