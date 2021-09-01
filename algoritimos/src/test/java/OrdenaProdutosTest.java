import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OrdenaProdutosTest {

    @Test
    void buscarMaisBarato() {

        OrdenaProdutos ordenaProdutos = new OrdenaProdutos(carregarLista());

        ordenaProdutos.selectionSort();

        double menorPrecoDaLista = ordenaProdutos.buscarMaisBarato();

        ordenaProdutos.imprimir();

        Assertions.assertEquals(16000, menorPrecoDaLista);
    }

    @Test
    void buscarMaisCaro() {
        OrdenaProdutos ordenaProdutos = new OrdenaProdutos(carregarLista());

        ordenaProdutos.selectionSort();

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

        ordenaProdutos.ordenarEntrePosicoes();

        ordenaProdutos.imprimir();

        verificaOrdenacao(ordenaProdutos);
    }

    @Test
    void insertionSort() {
        OrdenaProdutos ordenaProdutos = new OrdenaProdutos(carregarLista());

        ordenaProdutos.insertionSort();

        ordenaProdutos.imprimir();

        verificaOrdenacao(ordenaProdutos);
    }

    @Test
    void mergeSort() {
        OrdenaProdutos ordenaProdutos = new OrdenaProdutos(carregarLista());

        ordenaProdutos.mergeSort();

        ordenaProdutos.imprimir();

        verificaOrdenacao(ordenaProdutos);
    }


    private static void verificaOrdenacao(OrdenaProdutos ordenaProdutos) {
        double maiorPreco = ordenaProdutos.buscarMaisCaro();

        Assertions.assertEquals(1000000, maiorPreco);

        double menorPrecoDaLista = ordenaProdutos.buscarMaisBarato();

        Assertions.assertEquals(16000, menorPrecoDaLista);
    }


    @Test
    void testInsertionSort() {
        OrdenaProdutos ordenaProdutos = new OrdenaProdutos(carregarLista());

        ordenaProdutos.insertionSort(ordenaProdutos.getProdutos(), ordenaProdutos.getTamanho());

        ordenaProdutos.imprimir();

        verificaOrdenacao(ordenaProdutos);
    }

    @Test
    void selectionSort() {
        OrdenaProdutos ordenaProdutos = new OrdenaProdutos(carregarLista());

        ordenaProdutos.selectionSort(ordenaProdutos.getProdutos(), ordenaProdutos.getTamanho());

        ordenaProdutos.imprimir();

        verificaOrdenacao(ordenaProdutos);
    }

    @Test
    void imprimir() {
    }
}