package lista_2_heranca.veiculos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BicicletaTest {

    @Test
    void deveCalcularCustoDaBicicletaComFatorCorreto() {
        Bicicleta b = new Bicicleta("Caloi", "Elite", 1000f);
        assertEquals(1050f, b.calcularCusto(), 0.01f);
    }

    @Test
    void deveRetornarFatorDaBicicleta() {
        Bicicleta b = new Bicicleta("Caloi", "Elite", 1000f);
        assertEquals(1.05f, b.fatorBicicleta(), 0.001f);
    }

    @Test
    void deveExibirDadosDaBicicleta() {
        Bicicleta b = new Bicicleta("Caloi", "Elite", 1000f);
        String resultado = b.exibirDados();
        assertTrue(resultado.contains("Elite"));
        assertTrue(resultado.contains(String.valueOf(b.calcularCusto())));
    }



}