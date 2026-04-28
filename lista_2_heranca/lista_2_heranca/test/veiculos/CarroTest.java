package lista_2_heranca.veiculos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {
    @Test
    void deveCalcularCustoDoCarroComFatorCorreto() {
        Carro c = new Carro("Toyota", "Corolla", 100000f);
        assertEquals(150000f, c.calcularCusto(), 0.01f);
    }

    @Test
    void deveRetornarFatorDoCarro() {
        Carro c = new Carro("Toyota", "Corolla", 100000f);
        assertEquals(1.50f, c.fatorCarro(), 0.001f);
    }

    @Test
    void deveExibirDadosDoCarro() {
        Carro c = new Carro("Toyota", "Corolla", 100000f);
        String resultado = c.exibirDados();
        assertTrue(resultado.contains("Corolla"));
        assertTrue(resultado.contains(String.valueOf(c.calcularCusto())));
    }


}