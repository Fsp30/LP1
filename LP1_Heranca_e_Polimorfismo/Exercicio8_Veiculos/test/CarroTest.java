package if_oo_20261_heranca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    @Test
    void deveCalcularAluguelComSeguro() {
        Veiculo carro = new Carro("Toyota", "Corolla", 100.0f, 50.0f);
        assertEquals(350.0f, carro.calcularAluguel(3)); 
    }

    @Test
    void deveGerarContratoLocacao() {
        Veiculo carro = new Carro("Toyota", "Corolla", 100.0f, 50.0f);
        assertEquals("Contrato | Veiculo: Toyota Corolla | Dias: 3 | Total: R$ 350.0", carro.gerarContratoLocacao(3));
    }

    @Test
    void naoDeveAceitarDiasNegativosNoContrato() {
        try {
            Veiculo carro = new Carro("Toyota", "Corolla", 100.0f, 50.0f);
            carro.gerarContratoLocacao(-1);
            fail("Deveria ter barrado na clausula de guarda");
        } catch (IllegalArgumentException e) {
            assertEquals("A quantidade de dias deve ser maior que zero", e.getMessage());
        }
    }
}
