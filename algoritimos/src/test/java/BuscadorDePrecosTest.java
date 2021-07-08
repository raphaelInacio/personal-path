import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BuscadorDePrecosTest {

    @Test
    public void recuperarMenorPreco() {

        BuscadorDePrecos buscadorDePrecos = new BuscadorDePrecos(carregarLista());

        double menorPrecoDaLista = buscadorDePrecos.acharMenor();

        Assertions.assertEquals(16000, menorPrecoDaLista);
    }

    @Test
    public void recuperarMaiorPreco() {

        BuscadorDePrecos buscadorDePrecos = new BuscadorDePrecos(carregarLista());

        double maiorPreco = buscadorDePrecos.acharMaior();

        System.out.println(buscadorDePrecos);

        Assertions.assertEquals(1000000, maiorPreco);

    }

    @NotNull
    private Produto[] carregarLista() {
        double precos[] = new double[5];

        Produto[] produtos = {
                new Produto("Lamborgini", 1000000),
                new Produto("Jipe", 46000),
                new Produto("Brasilia", 16000),
                new Produto("Smart", 46000),
                new Produto("Fusca", 17000)
        };


        return produtos;
    }
}
