package lista_2_heranca.veiculos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotoTest {
    @Test
    void deveCalcularCustoDaMotoComFatorCorreto() {
        Moto m = new Moto("Honda", "CB500", 10000f);
        assertEquals(12000f, m.calcularCusto(), 0.01f);
    }

    @Test
    void deveRetornarFatorDaMoto() {
        Moto m = new Moto("Honda", "CB500", 10000f);
        assertEquals(1.20f, m.fatorMoto(), 0.001f);
    }

    @Test
    void deveExibirDadosDaMoto() {
        Moto m = new Moto("Honda", "CB500", 10000f);
        String resultado = m.exibirDados();
        assertTrue(resultado.contains("CB500"));
        assertTrue(resultado.contains(String.valueOf(m.calcularCusto())));
    }


}