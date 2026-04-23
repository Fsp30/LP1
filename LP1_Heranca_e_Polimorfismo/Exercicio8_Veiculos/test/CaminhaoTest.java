package if_oo_20261_heranca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CaminhaoTest {

    @Test
    void deveCalcularAluguelComTaxaDeCargaDiaria() {
        Veiculo caminhao = new Caminhao("Volvo", "FH 540", 300.0f, 100.0f);
        assertEquals(800.0f, caminhao.calcularAluguel(2));
    }
}
