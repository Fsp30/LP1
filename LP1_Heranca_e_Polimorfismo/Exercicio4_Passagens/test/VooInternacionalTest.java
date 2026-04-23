package if_oo_20261_heranca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VooInternacionalTest {

    @Test
    void deveCalcularPreco() {
        Voo voo = new VooInternacional("Sao Paulo", "Nova York", 5000.0f, "25/12/2026", 0.8f, 200.0f);
        assertEquals(4200.0f, voo.calcularPreco());
    }

    @Test
    void deveGerarBilhete() {
        Voo voo = new VooInternacional("Sao Paulo", "Nova York", 5000.0f, "25/12/2026", 0.8f, 200.0f);
        assertEquals("Bilhete: Sao Paulo para Nova York (25/12/2026) - Valor: R$ 4200.0", voo.gerarBilhete());
    }

    @Test
    void naoDeveAceitarTaxaNegativa() {
        try {
            Voo voo = new VooInternacional("Rio de Janeiro", "Paris", 9000.0f, "15/02/2027", 1.2f, -50.0f);
            fail("Deveria ter barrado na clausula de guarda");
        } catch (IllegalArgumentException e) {
            assertEquals("A taxa de conversao nao pode ser negativa", e.getMessage());
        }
    }
}
