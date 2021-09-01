import java.util.stream.Stream;

public class OrdenaProdutos {
    private final InsertionSort insertionSort = new InsertionSort();
    private final SelectionSort selectionSort = new SelectionSort();
    private Produto[] produtos;
    private BuscadorDePrecos buscadorDePrecos;

    public OrdenaProdutos(Produto[] produtos) {
        this.produtos = produtos;
        this.buscadorDePrecos = new BuscadorDePrecos(produtos);
        imprimir();
    }

    public int getTamanho() {
        return this.produtos.length;
    }

    // Insertion Sort
    public void insertionSort() {
        for (int i = 0; i < produtos.length; i++) {
            int analise = i;
            while (analise > 0 && produtos[analise].getPreco() < produtos[analise - 1].getPreco()) {
                Produto produtoDeAnalise = produtos[analise];
                Produto posicaoAnterior = produtos[analise - 1];
                produtos[analise] = posicaoAnterior;
                produtos[analise - 1] = produtoDeAnalise;
                analise--;
            }
        }
    }

    // Insertion Sort
    public void insertionSort(Produto[] produtos, int tamanho) {
        insertionSort.sort(produtos, tamanho);
    }

    // Selection Sort
    public void selectionSort() {
        for (int i = 0; i <= produtos.length - 1; i++) {

            for (int x = (i - 1); x <= produtos.length - 1; x++) {

                Produto produtoI = produtos[i];
                Produto produtoX = produtos[x];

                if (produtoX.getPreco() < produtoI.getPreco()) {
                    produtos[i] = produtoX;
                    produtos[x] = produtoI;
                }
            }
        }
    }

    // Selection Sort
    public void selectionSort(Produto[] produtos, int tamanho) {
        selectionSort.sort(produtos, tamanho);
    }

    // Merge Sort
    public void mergeSort() {
        ListaDividida listaDividida = new ListaDividida(this.produtos);
        Produto[] produtosOrdenadosComMergeSort = new Produto[listaDividida.tamanhoDasListas()];

        int posicaoLista1 = 0;
        int posicaoLista2 = 0;
        int posicaoListaOrdenada = 0;

        while (posicaoListaOrdenada < produtosOrdenadosComMergeSort.length) {

            Produto produto1 = null;
            Produto produto2 = null;

            if (posicaoLista1 < listaDividida.getLista1().length) {
                produto1 = listaDividida.getLista1()[posicaoLista1];
            }

            if (posicaoLista2 < listaDividida.getLista2().length) {
                produto2 = listaDividida.getLista2()[posicaoLista2];
            }

            if (produto1 != null && produto2 != null) {
                if (produto1.getPreco() < produto2.getPreco()) {
                    produtosOrdenadosComMergeSort[posicaoListaOrdenada] = produto1;
                    posicaoLista1++;
                } else {
                    produtosOrdenadosComMergeSort[posicaoListaOrdenada] = produto2;
                    posicaoLista2++;
                }
            } else {
                if (produto1 == null) {
                    produtosOrdenadosComMergeSort[posicaoListaOrdenada] = produto2;
                    posicaoLista2++;
                } else {
                    produtosOrdenadosComMergeSort[posicaoListaOrdenada] = produto1;
                    posicaoLista1++;
                }
            }


            posicaoListaOrdenada++;
        }

        System.out.println("..: Imprimindo lista com merge sort");
        this.produtos = produtosOrdenadosComMergeSort;
        imprimir();

    }

    // Merge Sort
    public void mergeSort(Produto[] produtos, int tamanho) {

    }

    public void ordenarEntrePosicoes() {
        int tamanho = produtos.length - 1;
        for (int atual = 0; atual <= tamanho; atual++) {
            int menorValor = this.buscadorDePrecos.acharMenorEntre(atual, tamanho);
            Produto produtoAtual = this.produtos[atual];
            Produto produtoMenorValor = this.produtos[menorValor];

            this.produtos[atual] = produtoMenorValor;
            this.produtos[menorValor] = produtoAtual;
        }
    }

    public double buscarMaisBarato() {
        return this.produtos[0].getPreco();
    }

    public double buscarMaisCaro() {
        return this.produtos[this.produtos.length - 1].getPreco();
    }

    public void imprimir() {
        System.out.println("..: Imprimindo lista");
        Stream.of(this.produtos).forEach(System.out::println);
    }

    public Produto[] getProdutos() {
        return produtos;
    }
}
