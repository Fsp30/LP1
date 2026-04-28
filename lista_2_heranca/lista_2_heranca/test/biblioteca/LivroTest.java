package lista_2_heranca.biblioteca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

public class LivroTest {
    @Test
    void deveCalcularDataDevolucaoDoLivroEm15Dias() {
        Livro livro = new Livro("Clean Code", 2008);
        LocalDate emprestimo = LocalDate.of(2024, 1, 1);
        assertEquals(LocalDate.of(2024, 1, 16), livro.calcularDataDevolucao(emprestimo));
    }

    @Test
    void deveRetornarTituloDoLivro() {
        Livro livro = new Livro("Clean Code", 2008);
        assertEquals("Clean Code", livro.getTitulo());
    }

    @Test
    void deveDevolverLivroCorretamenteQuandoEmprestimoNaViradaDoMes() {
        Livro livro = new Livro("Domain-Driven Design", 2003);
        LocalDate emprestimo = LocalDate.of(2024, 1, 25);
        assertEquals(LocalDate.of(2024, 2, 9), livro.calcularDataDevolucao(emprestimo));
    }

    @Test
    void deveDevolverLivroCorretamenteQuandoEmprestimoNaViradaDoAno() {
        Livro livro = new Livro("Refactoring", 1999);
        LocalDate emprestimo = LocalDate.of(2023, 12, 25);
        assertEquals(LocalDate.of(2024, 1, 9), livro.calcularDataDevolucao(emprestimo));
    }
}
