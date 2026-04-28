package lista_2_heranca.pedidos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoRoupaTest {
    @Test
    void deveRetornarPercentualDeDescontoDeProdutoRoupa() {
        ProdutoRoupa p = new ProdutoRoupa(200f);
        assertEquals(0.80f, p.PercentualDeDesconto(), 0.001f);
    }

    @Test
    void deveCalcularPrecoComDescontoDeProdutoRoupa() {
        ProdutoRoupa p = new ProdutoRoupa(200f);
        // 200 * 0.80 = 160
        assertEquals(160f, p.calcularPreco(), 0.01f);
    }
}