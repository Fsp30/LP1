package if_oo_20261_heranca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VooDomesticoTest {

    @Test
    void deveCalcularPreco() {
        Voo voo = new VooDomestico("Sao Paulo", "Rio de Janeiro", 1000.0f, "20/12/2026", 0.5f);
        assertEquals(500.0f, voo.calcularPreco());
    }

    @Test
    void deveGerarBilhete() {
        Voo voo = new VooDomestico("Sao Paulo", "Rio de Janeiro", 1000.0f, "20/12/2026", 0.5f);
        assertEquals("Bilhete: Sao Paulo para Rio de Janeiro (20/12/2026) - Valor: R$ 500.0", voo.gerarBilhete());
    }

    @Test
    void naoDeveAceitarDistanciaInvalida() {
        try {
            Voo voo = new VooDomestico("Curitiba", "Florianopolis", -100.0f, "10/01/2027", 0.5f);
            fail("Deveria ter barrado na clausula de guarda");
        } catch (IllegalArgumentException e) {
            assertEquals("A distancia deve ser maior que zero", e.getMessage());
        }
    }
}
