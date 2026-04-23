package if_oo_20261_heranca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MotoTest {

    @Test
    void deveCalcularAluguelSimples() {
        Veiculo moto = new Moto("Honda", "CG 160", 50.0f);
        assertEquals(200.0f, moto.calcularAluguel(4));
    }

    @Test
    void naoDeveAceitarMarcaVazia() {
        try {
            new Moto("", "CG 160", 50.0f);
            fail("Deveria ter barrado na clausula de guarda");
        } catch (IllegalArgumentException e) {
            assertEquals("A marca nao pode ser vazia", e.getMessage());
        }
    }
}
