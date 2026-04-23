package if_oo_20261_heranca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProdutoEletronicoTest {

    @Test
    void deveCalcularPrecoComDesconto() {
        Produto celular = new ProdutoEletronico("Smartphone", 1000.0f);
        assertEquals(900.0f, celular.calcularPreco());
    }

    @Test
    void deveGerarRecibo() {
        Produto celular = new ProdutoEletronico("Smartphone", 1000.0f);
        assertEquals("Recibo - Produto: Smartphone | Valor Final: R$ 900.0", celular.gerarRecibo());
    }

    @Test
    void naoDeveAceitarPrecoNegativo() {
        try {
            Produto notebook = new ProdutoEletronico("Notebook", -1500.0f);
            fail("Deveria ter barrado na clausula de guarda");
        } catch (IllegalArgumentException e) {
            assertEquals("O preco base nao pode ser negativo", e.getMessage());
        }
    }
}
