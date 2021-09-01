public class InsertionSort {
    public InsertionSort() {
    }// Insertion Sort

    public void sort(Produto[] produtos, int tamanho) {
        for (int i = 0; i < tamanho; i++) {
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
}