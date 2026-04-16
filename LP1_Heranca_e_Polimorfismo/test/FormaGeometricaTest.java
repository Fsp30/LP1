package if_oo_20261_heranca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FormaGeometricaTest {

    @Test
    void deveCalcularAreaCirculo() {
        FormaGeometrica circulo = new Circulo(3.0);
        assertEquals(28.27431, circulo.calcularArea(), 0.00001);
    }

    @Test
    void deveCalcularPerimetroCirculo() {
        FormaGeometrica circulo = new Circulo(3.0);
        assertEquals(18.84954, circulo.calcularPerimetro(), 0.00001);
    }
    
    @Test
    void naoDeveAceitarRaioInvalido() {
        try {
            FormaGeometrica circulo = new Circulo(0.0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O raio deve ser maior que zero", e.getMessage());
        }
    }

    @Test
    void deveCalcularAreaRetangulo() {
        FormaGeometrica retangulo = new Retangulo(4.0, 5.0);
        assertEquals(20.0, retangulo.calcularArea());
    }

    @Test
    void deveCalcularPerimetroRetangulo() {
        FormaGeometrica retangulo = new Retangulo(4.0, 5.0);
        assertEquals(18.0, retangulo.calcularPerimetro());
    }
    
    @Test
    void naoDeveAceitarMedidasInvalidasRetangulo() {
        try {
            FormaGeometrica retangulo = new Retangulo(-2.0, 5.0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("A largura deve ser maior que zero", e.getMessage());
        }
    }
}
