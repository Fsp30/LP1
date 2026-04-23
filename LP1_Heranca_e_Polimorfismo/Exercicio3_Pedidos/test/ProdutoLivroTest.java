package if_oo_20261_heranca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProdutoLivroTest {

    @Test
    void deveCalcularPrecoComDesconto() {
        Produto livro = new ProdutoLivro("Java para Iniciantes", 50.0f);
        assertEquals(47.50f, livro.calcularPreco());
    }

    @Test
    void deveGerarRecibo() {
        Produto livro = new ProdutoLivro("Java para Iniciantes", 50.0f);
        assertEquals("Recibo - Produto: Java para Iniciantes | Valor Final: R$ 47.5", livro.gerarRecibo());
    }
}
