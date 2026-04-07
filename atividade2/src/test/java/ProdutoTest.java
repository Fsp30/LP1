import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    Produto produto;

    @BeforeEach
    public void setUp() {
        produto = new Produto();
        produto.setNome("Notebook");
        produto.setPreco(3000f);
        produto.setQuantidadeEstoque(10);
        produto.setCategoria("Eletrônicos");
    }


    @Test
    public void deveDefinirNomeValido() {
        produto.setNome("Tablet");
        assertEquals("Tablet", produto.getNome());
    }

    @Test
    public void deveTentarDefinirNomeVazio() {
        try {
            produto.setNome("   ");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O produto deve ter um nome", e.getMessage());
        }
    }

    @Test
    public void deveDefinirPrecoValido() {
        produto.setPreco(100f);
        assertEquals(100f, produto.getPreco());
    }

    @Test
    public void deveDefinirPrecoZero() {
        produto.setPreco(0f);
        assertEquals(0f, produto.getPreco());
    }

    @Test
    public void deveTentarDefinirPrecoNegativo() {
        try {
            produto.setPreco(-0.1f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O valor do produto não pode ser negativo", e.getMessage());
        }
    }

    @Test
    public void deveDefinirQuantidadeEstoqueValida() {
        produto.setQuantidadeEstoque(5);
        assertEquals(5, produto.getQuantidadeEstoque());
    }

    @Test
    public void deveTentarDefinirQuantidadeEstoqueNegativa() {
        try {
            produto.setQuantidadeEstoque(-1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("A quantidade de itens não pode ser negativa", e.getMessage());
        }
    }

    @Test
    public void deveDefinirCategoriaValida() {
        produto.setCategoria("Informática");
        assertEquals("Informática", produto.getCategoria());
    }

    @Test
    public void deveTentarDefinirCategoriaVazia() {
        try {
            produto.setCategoria("   ");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("A gategoria do produto não pode estar vazia", e.getMessage());
        }
    }

    @Test
    public void deveAdicionarEstoque() {
        produto.adicionarEstoque(5);
        assertEquals(15, produto.getQuantidadeEstoque());
    }

    @Test
    public void deveTentarAdicionarEstoqueZero() {
        try {
            produto.adicionarEstoque(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("É necessário adicionar pelo menos uma unidade", e.getMessage());
        }
    }

    @Test
    public void deveTentarAdicionarEstoqueNegativo() {
        try {
            produto.adicionarEstoque(-1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("É necessário adicionar pelo menos uma unidade", e.getMessage());
        }
    }


    @Test
    public void deveRemoverEstoque() {
        produto.removerEstoque(3);
        assertEquals(7, produto.getQuantidadeEstoque());
    }

    @Test
    public void deveRemoverTodoOEstoque() {
        produto.removerEstoque(10);
        assertEquals(0, produto.getQuantidadeEstoque());
    }

    @Test
    public void deveTentarRemoverEstoqueAcimaDoDisponivel() {
        try {
            produto.removerEstoque(11);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("A quantidade requerida de remoção excede a quantidade presente no estoque", e.getMessage());
        }
    }


    @Test
    public void deveCalcularDesconto() {
        float desconto = produto.calcularDesconto(10);
        assertEquals(300f, desconto, 0.01f);
    }

    @Test
    public void deveAplicarDesconto() {
        float precoComDesconto = produto.aplicarDesconto(10);
        assertEquals(2700f, precoComDesconto, 0.01f);
    }
}