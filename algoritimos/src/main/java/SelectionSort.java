public class SelectionSort {
    public SelectionSort() {
    }// Selection Sort

    public void sort(Produto[] produtos, int tamanho) {
        for (int i = 0; i < tamanho; i++) {

            for (int x = i; x < tamanho; x++) {

                Produto produtoI = produtos[i];
                Produto produtoX = produtos[x];

                if (produtoX.getPreco() < produtoI.getPreco()) {
                    produtos[i] = produtoX;
                    produtos[x] = produtoI;
                }
            }
        }
    }
}