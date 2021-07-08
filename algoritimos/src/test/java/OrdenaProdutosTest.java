import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrdenaProdutosTest {

    @Test
    void buscarMaisBarato() {

        OrdenaProdutos ordenaProdutos = new OrdenaProdutos(carregarLista());

        ordenaProdutos.ordenar();

        double menorPrecoDaLista = ordenaProdutos.buscarMaisBarato();

        ordenaProdutos.imprimir();

        Assertions.assertEquals(16000, menorPrecoDaLista);
    }

    @Test
    void buscarMaisCaro() {
        OrdenaProdutos ordenaProdutos = new OrdenaProdutos(carregarLista());

        ordenaProdutos.imprimir();

        ordenaProdutos.ordenar();

        double maiorPreco = ordenaProdutos.buscarMaisCaro();

        Assertions.assertEquals(1000000, maiorPreco);

    }

    @NotNull
    private Produto[] carregarLista() {

        Produto[] produtos = {
                new Produto("Lamborgini", 1000000),
                new Produto("Jipe", 46000),
                new Produto("Brasilia", 16000),
                new Produto("Smart", 46000),
                new Produto("Fusca", 17000)
        };

        return produtos;
    }

    @Test
    void ordenarEntrePosicoes() {
        OrdenaProdutos ordenaProdutos = new OrdenaProdutos(carregarLista());

        ordenaProdutos.imprimir();

        ordenaProdutos.ordenarEntrePosicoes();

        ordenaProdutos.imprimir();

        double maiorPreco = ordenaProdutos.buscarMaisCaro();

        Assertions.assertEquals(1000000, maiorPreco);

        double menorPrecoDaLista = ordenaProdutos.buscarMaisBarato();

        Assertions.assertEquals(16000, menorPrecoDaLista);
    }

}