package if_oo_20261_heranca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RoupaLojaTest {

    @Test
    void deveRealizarVendaComDesconto() {
        ProdutoLoja calca = new RoupaLoja("Calca Jeans", 100.0f, 10.0f, 20.0f);
        assertEquals("Venda concluida! Total: R$ 180.0 | Estoque restante: 8.0", calca.realizarVenda(2.0f));
    }

    @Test
    void naoDeveAceitarDescontoNegativo() {
        try {
            ProdutoLoja blusa = new RoupaLoja("Blusa", 50.0f, 10.0f, -5.0f);
            fail("Deveria ter barrado na clausula de guarda");
        } catch (IllegalArgumentException e) {
            assertEquals("O desconto nao pode ser negativo", e.getMessage());
        }
    }
}
