import java.util.stream.Stream;

public class OrdenaProdutos {
    private Produto[] produtos;
    private BuscadorDePrecos buscadorDePrecos;

    public OrdenaProdutos(Produto[] produtos) {
        this.produtos = produtos;
        this.buscadorDePrecos = new BuscadorDePrecos(produtos);
    }

    public void ordenar() {
        for (int i = 0; i <= produtos.length - 1; i++) {

            for (int x = i; x <= produtos.length - 1; x++) {

                Produto produtoI = produtos[i];
                Produto produtoX = produtos[x];

                if (produtoX.getPreco() < produtoI.getPreco()) {
                    produtos[i] = produtoX;
                    produtos[x] = produtoI;
                }
            }
        }
    }

    public void ordenarEntrePosicoes() {
        for (int atual = 0; atual < produtos.length; atual++) {
            int menorValor = this.buscadorDePrecos.acharMenorEntre(atual, produtos.length);
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
}
