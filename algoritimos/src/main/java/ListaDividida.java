import java.util.stream.Stream;

public class ListaDividida {

    private Produto[] lista1;
    private Produto[] lista2;
    private SelectionSort selectionSort = new SelectionSort();

    public Produto[] getLista1() {
        return lista1;
    }

    public Produto[] getLista2() {
        return lista2;
    }

    public int tamanhoDasListas() {
        return Math.addExact(getLista1().length, getLista2().length);
    }

    public ListaDividida(Produto[] produtos) {
        dividir(produtos);
    }

    private void dividir(Produto[] produtos) {

        System.out.println("..: Verificando o tamanho da lista: " + produtos.length);
        int metadeDaLista = Math.floorDiv(produtos.length, 2);
        lista1 = new Produto[metadeDaLista];
        lista2 = new Produto[Math.subtractExact(produtos.length, metadeDaLista)];

        int posicaoLista1 = 0;
        int posicaoLista2 = 0;

        System.out.println("Duas listas criadas com o tamanho: " + lista1.length + " e " + lista2.length);
        for (int i = 0; i < produtos.length; i++) {

            if (i < metadeDaLista) {
                System.out.println("..: Preenher primeira lista com: " + produtos[i]);
                lista1[posicaoLista1] = produtos[i];
                posicaoLista1++;
            } else {
                System.out.println("..: Preenher segunda lista com: " + produtos[i]);
                lista2[posicaoLista2] = produtos[i];
                posicaoLista2++;
            }
        }

        ordenar();
        imprimir();
    }

    private void ordenar() {
        selectionSort.sort(lista1, lista1.length);
        selectionSort.sort(lista2, lista2.length);
    }

    public void imprimir() {
        System.out.println("..: Imprimindo lista 1: ");
        Stream.of(this.lista1).forEach(System.out::println);

        System.out.println("..: Imprimindo lista 2: ");
        Stream.of(this.lista2).forEach(System.out::println);
    }
}
