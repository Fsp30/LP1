package lista_2_heranca.pedidos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {
    @Test
    void deveLancarExcecaoAoCriarProdutoComPrecoNegativo() {
        try {
            new ProdutoEletronico(-1f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O valor do produto não pode ser negativo", e.getMessage());
        }
    }

    @Test
    void deveCriarProdutoComPrecoZero() {
        ProdutoEletronico p = new ProdutoEletronico(0f);
        assertEquals(0f, p.calcularPreco(), 0.01f);
    }
}