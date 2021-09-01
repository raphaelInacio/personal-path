package strategy.solucao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import strategy.Orcamento;

import java.math.BigDecimal;

class CalculadoraDeImpostoStrategyTest {

    @Test
    void deveCalcularImposto() {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        Imposto impostoICMS = new ICMS();
        Imposto impostISS = new ISS();
        Assertions.assertEquals(new BigDecimal("6.00"), impostoICMS.calcular(orcamento));
        Assertions.assertEquals(new BigDecimal("10.0"), impostISS.calcular(orcamento));
    }
}