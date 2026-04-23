package if_oo_20261_heranca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EletronicoLojaTest {

    @Test
    void deveRealizarVendaEBaixarEstoque() {
        ProdutoLoja tv = new EletronicoLoja("TV 50", 2000.0f, 5.0f);
        assertEquals("Venda concluida! Total: R$ 4000.0 | Estoque restante: 3.0", tv.realizarVenda(2.0f));
    }

    @Test
    void naoDeveVenderSemEstoqueSuficiente() {
        try {
            ProdutoLoja tv = new EletronicoLoja("TV 50", 2000.0f, 5.0f);
            tv.realizarVenda(10.0f); 
            fail("Deveria ter barrado na clausula de guarda");
        } catch (IllegalArgumentException e) {
            assertEquals("Estoque insuficiente", e.getMessage());
        }
    }
}
