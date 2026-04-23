package if_oo_20261_heranca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RetanguloTest {

    @Test
    void deveCalcularArea() {
        FormaGeometrica retangulo = new Retangulo(4.0, 5.0);
        assertEquals(20.0, retangulo.calcularArea());
    }

    @Test
    void deveGerarRelatorio() {
        FormaGeometrica retangulo = new Retangulo(4.0, 5.0);
        assertEquals("Resultado -> Area: 20.0 | Perimetro: 18.0", retangulo.gerarRelatorio());
    }

    @Test
    void naoDeveAceitarMedidasInvalidas() {
        try {
            FormaGeometrica retangulo = new Retangulo(-2.0, 5.0);
            fail("Deveria ter barrado na clausula de guarda");
        } catch (IllegalArgumentException e) {
            assertEquals("A largura deve ser maior que zero", e.getMessage());
        }
    }
}
