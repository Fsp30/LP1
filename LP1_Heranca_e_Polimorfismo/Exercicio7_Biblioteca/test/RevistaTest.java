package if_oo_20261_heranca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RevistaTest {

    @Test
    void deveCalcularDataDevolucao() {
        MaterialBiblioteca revista = new Revista("Linux Magazine", "2026");
        assertEquals(12, revista.calcularDataDevolucao(5)); 
    }

    @Test
    void naoDeveAceitarDiaInvalido() {
        try {
            MaterialBiblioteca revista = new Revista("Linux Magazine", "2026");
            revista.gerarComprovanteEmprestimo(32);
            fail("Deveria ter barrado na clausula de guarda");
        } catch (IllegalArgumentException e) {
            assertEquals("Dia de emprestimo invalido", e.getMessage());
        }
    }
}
