package if_oo_20261_heranca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FilmeTest {

    @Test
    void deveCalcularDataDevolucao() {
        MaterialBiblioteca filme = new Filme("O Codigo", "2025");
        assertEquals(6, filme.calcularDataDevolucao(1)); 
    }
}
