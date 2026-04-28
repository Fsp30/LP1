package lista_2_heranca.passagens;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VooTest {
    @Test
    void deveLancarExcecaoComOrigemVazia() {
        try {
            new VooDomestico("   ", "Rio de Janeiro", 400f, "2024-01-01");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O local de origem não pode estar vazio", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoComDestinoVazio() {
        try {
            new VooDomestico("São Paulo", "   ", 400f, "2024-01-01");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O local de destino não pode estar vazio", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoComDistanciaNegativa() {
        try {
            new VooDomestico("São Paulo", "Rio de Janeiro", -1f, "2024-01-01");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O valor da distancia não pode ser negativo", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoComDataVazia() {
        try {
            new VooDomestico("São Paulo", "Rio de Janeiro", 400f, "   ");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("A campo de data não pode estar vazio", e.getMessage());
        }
    }


    @Test
    void deveRetornarOrigemDoVoo() {
        VooDomestico v = new VooDomestico("São Paulo", "Rio de Janeiro", 400f, "2024-01-01");
        assertEquals("São Paulo", v.getOrigem());
    }

    @Test
    void deveRetornarDestinoDoVoo() {
        VooDomestico v = new VooDomestico("São Paulo", "Rio de Janeiro", 400f, "2024-01-01");
        assertEquals("Rio de Janeiro", v.getDestino());
    }

    @Test
    void deveRetornarDistanciaDoVoo() {
        VooDomestico v = new VooDomestico("São Paulo", "Rio de Janeiro", 400f, "2024-01-01");
        assertEquals(400f, v.getDistancia(), 0.01f);
    }

    @Test
    void deveRetornarDataDoVoo() {
        VooDomestico v = new VooDomestico("São Paulo", "Rio de Janeiro", 400f, "2024-01-01");
        assertEquals("2024-01-01", v.getData());
    }
}