package strategy.problema;

import strategy.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {
    public BigDecimal calcular(Orcamento orcamento, TipoImpostoEnum comImposto) {
        switch (comImposto) {
            case ISS:
                return orcamento.getValor().multiply(new BigDecimal("0.1"));
            case ICMS:
                return orcamento.getValor().multiply(new BigDecimal("0.06"));
            default:
                return BigDecimal.ZERO;
        }
    }
}
