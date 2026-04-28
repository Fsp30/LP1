package lista_2_heranca.gerenciamento_produtos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutosAlimentosTest {
    @Test
    void deveRetornarNomeDoAlimento() {
        ProdutosAlimentos p = new ProdutosAlimentos("Arroz", 10f, 5f);
        assertEquals("Arroz", p.getNome());
    }

    @Test
    void deveCalcularPrecoDoAlimento() {
        ProdutosAlimentos p = new ProdutosAlimentos("Arroz", 10f, 5f);
        assertEquals(20f, p.calcularPreco(2f), 0.01f);
    }

    @Test
    void deveAtualizarEstoqueAposCompraDeAlimento() {
        ProdutosAlimentos p = new ProdutosAlimentos("Arroz", 10f, 5f);
        p.calcularPreco(2f);
        assertEquals(3f, p.getQuantidadeEstoque(), 0.01f);
    }

    @Test
    void deveLancarExcecaoAoComprarMenosDe100gDeAlimento() {
        try {
            ProdutosAlimentos p = new ProdutosAlimentos("Arroz", 10f, 5f);
            p.calcularPreco(0.05f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Não se pode comprar menos do que 100g", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoAoComprarAlimentoComEstoqueInsuficiente() {
        try {
            ProdutosAlimentos p = new ProdutosAlimentos("Arroz", 10f, 1f);
            p.calcularPreco(5f);
            fail();
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Estoque insuficiente"));
        }
    }

    @Test
    void devePermitirCompraExatamenteDe100gDeAlimento() {
        ProdutosAlimentos p = new ProdutosAlimentos("Arroz", 10f, 5f);
        assertEquals(1f, p.calcularPreco(0.1f), 0.01f);
    }
}