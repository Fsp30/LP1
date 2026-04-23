package if_oo_20261_heranca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProdutoRoupaTest {

    @Test
    void deveCalcularPrecoComDesconto() {
        Produto camisa = new ProdutoRoupa("Camisa Polo", 100.0f);
        assertEquals(80.0f, camisa.calcularPreco());
    }

    @Test
    void deveGerarRecibo() {
        Produto camisa = new ProdutoRoupa("Camisa Polo", 100.0f);
        assertEquals("Recibo - Produto: Camisa Polo | Valor Final: R$ 80.0", camisa.gerarRecibo());
    }

    @Test
    void naoDeveAceitarNomeVazio() {
        try {
            Produto calca = new ProdutoRoupa("", 120.0f);
            fail("Deveria ter barrado na clausula de guarda");
        } catch (IllegalArgumentException e) {
            assertEquals("O nome do produto nao pode ser vazio", e.getMessage());
        }
    }
}
