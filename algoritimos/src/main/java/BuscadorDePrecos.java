public class BuscadorDePrecos {

    private Produto[] produtos;

    public BuscadorDePrecos(Produto[] produtos) {
        this.produtos = produtos;
    }

    public double acharMenor() {
        int menorPreco = 0;
        for (int atual = 0; atual < this.produtos.length; atual++)
            if (produtos[atual].getPreco() < produtos[menorPreco].getPreco()) menorPreco = atual;
        return this.produtos[menorPreco].getPreco();
    }


    public int acharMenorEntre(int inicio, int termino) {
        int menorPreco = inicio;
        for (int atual = inicio; atual <= termino; atual++)
            if (produtos[atual].getPreco() < produtos[menorPreco].getPreco()) menorPreco = atual;
        return menorPreco;
    }

    public double acharMaior() {
        int maiorPreco = 0;
        for (int atual = 0; atual < this.produtos.length; atual++)
            if (produtos[atual].getPreco() > produtos[maiorPreco].getPreco()) maiorPreco = atual;
        return this.produtos[maiorPreco].getPreco();
    }
}
