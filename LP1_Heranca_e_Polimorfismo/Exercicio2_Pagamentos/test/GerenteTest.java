package if_oo_20261_heranca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GerenteTest {

    @Test
    void deveCalcularPagamento() {
        Funcionario gerente = new Gerente(4000.0f, 1500.0f);
        assertEquals(5500.0f, gerente.calcularPagamento());
    }

    @Test
    void deveGerarHolerite() {
        Funcionario gerente = new Gerente(4000.0f, 1500.0f);
        assertEquals("Holerite processado. Valor a receber: R$ 5500.0", gerente.gerarHolerite());
    }

    @Test
    void naoDeveAceitarBonusNegativo() {
        try {
            Funcionario gerente = new Gerente(4000.0f, -500.0f);
            fail("Deveria ter barrado na clausula de guarda");
        } catch (IllegalArgumentException e) {
            assertEquals("O bonus nao pode ser negativo", e.getMessage());
        }
    }
}
