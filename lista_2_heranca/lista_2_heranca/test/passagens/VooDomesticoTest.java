package lista_2_heranca.passagens;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VooDomesticoTest {

    @Test
    void deveCalcularPrecoDoVooDomestico() {
        VooDomestico v = new VooDomestico("São Paulo", "Rio de Janeiro", 400f, "2024-01-01");
        assertEquals(500f, v.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarFatorPrecoDoVooDomestico() {
        VooDomestico v = new VooDomestico("São Paulo", "Rio de Janeiro", 400f, "2024-01-01");
        assertEquals(1.25f, v.fatorPreco(), 0.001f);
    }

    @Test
    void deveCalcularPrecoDoVooDomesticoComDistanciaZero() {
        VooDomestico v = new VooDomestico("São Paulo", "Rio de Janeiro", 0f, "2024-01-01");
        assertEquals(0f, v.calcularPreco(), 0.01f);
    }
}