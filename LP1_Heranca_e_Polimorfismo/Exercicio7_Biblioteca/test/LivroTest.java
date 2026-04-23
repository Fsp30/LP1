package if_oo_20261_heranca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LivroTest {

    @Test
    void deveCalcularDataDevolucao() {
        MaterialBiblioteca livro = new Livro("Java Profissional", "2024");
        assertEquals(25, livro.calcularDataDevolucao(10)); // 10 + 15
    }

    @Test
    void deveGerarComprovante() {
        MaterialBiblioteca livro = new Livro("Java Profissional", "2024");
        assertEquals("Emprestimo: Java Profissional | Devolver no dia: 25", livro.gerarComprovanteEmprestimo(10));
    }

    @Test
    void naoDeveAceitarTituloVazio() {
        try {
            new Livro("", "2024");
            fail("Deveria ter barrado na clausula de guarda");
        } catch (IllegalArgumentException e) {
            assertEquals("O titulo nao pode ser vazio", e.getMessage());
        }
    }
}
