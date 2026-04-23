package if_oo_20261_heranca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CirculoTest {

    @Test
    void deveCalcularArea() {
        FormaGeometrica circulo = new Circulo(3.0);
        assertEquals(28.27431, circulo.calcularArea(), 0.00001);
    }

    @Test
    void deveGerarRelatorio() {
        FormaGeometrica circulo = new Circulo(3.0);
        assertEquals("Resultado -> Area: 28.27431 | Perimetro: 18.84954", circulo.gerarRelatorio());
    }

    @Test
    void naoDeveAceitarRaioInvalido() {
        try {
            FormaGeometrica circulo = new Circulo(0.0);
            fail("Deveria ter barrado na clausula de guarda");
        } catch (IllegalArgumentException e) {
            assertEquals("O raio deve ser maior que zero", e.getMessage());
        }
    }
}
