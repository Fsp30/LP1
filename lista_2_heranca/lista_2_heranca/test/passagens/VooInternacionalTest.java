package lista_2_heranca.passagens;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VooInternacionalTest {
    @Test
    void deveCalcularPrecoDoVooInternacional() {
        VooInternacional v = new VooInternacional("São Paulo", "Lisboa", 9000f, "2024-06-01");
        assertEquals(16965f, v.calcularPreco(), 0.1f);
    }

    @Test
    void deveRetornarFatorPrecoDoVooInternacional() {
        VooInternacional v = new VooInternacional("São Paulo", "Lisboa", 9000f, "2024-06-01");
        assertEquals(1.30f, v.fatorPreco(), 0.001f);
    }

    @Test
    void deveRetornarConversaoDeMoedaDoVooInternacional() {
        VooInternacional v = new VooInternacional("São Paulo", "Lisboa", 9000f, "2024-06-01");
        assertEquals(1.45f, v.conversaoDeMoeda(), 0.001f);
    }

    @Test
    void deveCalcularPrecoDoVooInternacionalComDistanciaZero() {
        VooInternacional v = new VooInternacional("São Paulo", "Lisboa", 0f, "2024-06-01");
        assertEquals(0f, v.calcularPreco(), 0.01f);
    }
}