package if_oo_20261_heranca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AlimentoLojaTest {

    @Test
    void deveRealizarVendaPorQuilo() {
        ProdutoLoja carne = new AlimentoLoja("Picanha", 40.0f, 50.0f);
        assertEquals("Venda concluida! Total: R$ 60.0 | Estoque restante: 48.5", carne.realizarVenda(1.5f));
    }
}
