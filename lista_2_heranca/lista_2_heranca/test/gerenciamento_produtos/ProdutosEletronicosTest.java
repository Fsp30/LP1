package lista_2_heranca.gerenciamento_produtos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutosEletronicosTest {
    @Test
    void deveCalcularPrecoDeEletronico() {
        ProdutosEletronicos p = new ProdutosEletronicos("Notebook", 3000f, 10);
        assertEquals(6000f, p.calcularPreco(2f), 0.01f);
    }

    @Test
    void deveAtualizarEstoqueAposCompraDeEletronico() {
        ProdutosEletronicos p = new ProdutosEletronicos("Notebook", 3000f, 10);
        p.calcularPreco(3f);
        assertEquals(7f, p.getQuantidadeEstoque(), 0.01f);
    }

    @Test
    void deveLancarExcecaoAoComprarEletronicoEmQuantidadeFracionada() {
        try {
            ProdutosEletronicos p = new ProdutosEletronicos("Notebook", 3000f, 10);
            p.calcularPreco(1.5f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Eletrônicos só podem ser comprados em quantidades inteiras", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoAoComprarEletronicoComEstoqueInsuficiente() {
        try {
            ProdutosEletronicos p = new ProdutosEletronicos("Notebook", 3000f, 2);
            p.calcularPreco(5f);
            fail();
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Estoque insuficiente"));
        }
    }
}