package lista_2_heranca.pedidos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProdutoLivroTest {
    @Test
    void roupaDeveTermaiorDescontoQueEletronico() {
        float preco = 500f;
        ProdutoRoupa roupa = new ProdutoRoupa(preco);
        ProdutoEletronico eletronico = new ProdutoEletronico(preco);
        assertTrue(roupa.calcularPreco() < eletronico.calcularPreco());
    }

    @Test
    void eletronicoDeveTermaiorDescontoQueLivro() {
        float preco = 500f;
        ProdutoEletronico eletronico = new ProdutoEletronico(preco);
        ProdutoLivro livro = new ProdutoLivro(preco);
        assertTrue(eletronico.calcularPreco() < livro.calcularPreco());
    }
}
