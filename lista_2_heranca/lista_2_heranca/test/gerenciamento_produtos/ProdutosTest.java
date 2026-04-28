package lista_2_heranca.gerenciamento_produtos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutosTest {
    @Test
    void deveLancarExcecaoAoCriarProdutoComNomeVazio() {
        assertThrows(IllegalArgumentException.class, () ->
                new ProdutosAlimentos("   ", 10f, 5f));
    }

    @Test
    void deveLancarExcecaoAoCriarProdutoComNomeNulo() {
        assertThrows(IllegalArgumentException.class, () ->
                new ProdutosAlimentos(null, 10f, 5f));
    }

    @Test
    void deveLancarExcecaoAoCriarProdutoComPrecoZero() {
        try {
            new ProdutosAlimentos("Arroz", 0f, 5f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O valor do produto deve ser maior que zero", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoAoCriarProdutoComPrecoNegativo() {
        try {
            new ProdutosAlimentos("Arroz", -1f, 5f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O valor do produto deve ser maior que zero", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoAoCriarProdutoComEstoqueNegativo() {
        try {
            new ProdutosAlimentos("Arroz", 10f, -1f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("A quantidade no estoque não pode ser negativa", e.getMessage());
        }
    }

    @Test
    void deveCriarProdutoComEstoqueZero() {
        ProdutosAlimentos p = new ProdutosAlimentos("Arroz", 10f, 0f);
        assertEquals(0f, p.getQuantidadeEstoque());
    }
}