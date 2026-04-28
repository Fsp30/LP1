package lista_2_heranca.gerenciamento_produtos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutosRoupasTest {
    @Test
    void deveAplicarDescontoAoComprarMaisDe9Roupas() {
        ProdutosRoupas p = new ProdutosRoupas("Camiseta", 50f, 20);
        assertEquals(475f, p.calcularPreco(10f), 0.01f);
    }

    @Test
    void naoDeveAplicarDescontoAoComprar9OuMenosRoupas() {
        ProdutosRoupas p = new ProdutosRoupas("Camiseta", 50f, 20);
        assertEquals(450f, p.calcularPreco(9f), 0.01f);
    }

    @Test
    void deveRetornarPercentualDeDescontoDeRoupas() {
        ProdutosRoupas p = new ProdutosRoupas("Camiseta", 50f, 20);
        assertEquals(0.95f, p.getPercentualDesconto(), 0.001f);
    }

    @Test
    void deveLancarExcecaoAoComprarRoupaEmQuantidadeFracionada() {
        try {
            ProdutosRoupas p = new ProdutosRoupas("Camiseta", 50f, 20);
            p.calcularPreco(2.5f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Roupas só podem ser compradas em quantidades inteiras", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoAoComprarRoupaComEstoqueInsuficiente() {
        try {
            ProdutosRoupas p = new ProdutosRoupas("Camiseta", 50f, 3);
            p.calcularPreco(5f);
            fail();
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Estoque insuficiente"));
        }
    }

    @Test
    void deveAtualizarEstoqueAposCompraDeRoupa() {
        ProdutosRoupas p = new ProdutosRoupas("Camiseta", 50f, 20);
        p.calcularPreco(5f);
        assertEquals(15f, p.getQuantidadeEstoque(), 0.01f);
    }
}
