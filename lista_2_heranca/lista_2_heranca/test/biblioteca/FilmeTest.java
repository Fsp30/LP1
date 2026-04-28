package lista_2_heranca.biblioteca;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class FilmeTest {
    @Test
    void deveCalcularDataDevolucaoDoFilmeEm5Dias() {
        Filme filme = new Filme("O Poderoso Chefão", 1972);
        LocalDate emprestimo = LocalDate.of(2024, 1, 1);
        assertEquals(LocalDate.of(2024, 1, 6), filme.calcularDataDevolucao(emprestimo));
    }

    @Test
    void deveRetornarTituloDoFilme() {
        Filme filme = new Filme("O Poderoso Chefão", 1972);
        assertEquals("O Poderoso Chefão", filme.getTitulo());
    }

    @Test
    void deveDevolverFilmeCorretamenteQuandoEmprestimoNaViradaDoMes() {
        Filme filme = new Filme("Matrix", 1999);
        LocalDate emprestimo = LocalDate.of(2024, 1, 30);
        assertEquals(LocalDate.of(2024, 2, 4), filme.calcularDataDevolucao(emprestimo));
    }

}