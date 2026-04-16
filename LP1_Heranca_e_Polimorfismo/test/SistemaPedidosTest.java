package if_oo_20261_heranca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SistemaPedidosTest {

    @Test
    void deveCalcularPrecoEletronico() {
        Produto celular = new ProdutoEletronico("Smartphone", 1000.0f);
        assertEquals(900.0f, celular.calcularPreco());
    }

    @Test
    void deveCalcularPrecoRoupa() {
        Produto camisa = new ProdutoRoupa("Camisa Polo", 100.0f);
        assertEquals(80.0f, camisa.calcularPreco());
    }

    @Test
    void deveCalcularPrecoLivro() {
        Produto livro = new ProdutoLivro("Java para Iniciantes", 50.0f);
        assertEquals(47.50f, livro.calcularPreco());
    }
    
    @Test
    void naoDeveAceitarPrecoNegativo() {
        try {
            Produto notebook = new ProdutoEletronico("Notebook", -1500.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O preco base nao pode ser negativo", e.getMessage());
        }
    }
    
    @Test
    void naoDeveAceitarNomeVazio() {
        try {
            Produto calca = new ProdutoRoupa("", 120.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O nome do produto nao pode ser vazio", e.getMessage());
        }
    }
}
