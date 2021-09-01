package strategy.solucao;

import strategy.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostoStrategy {
    BigDecimal calcular(Orcamento orcamento, Imposto comImposto) {
        return comImposto.calcular(orcamento);
    }
}
