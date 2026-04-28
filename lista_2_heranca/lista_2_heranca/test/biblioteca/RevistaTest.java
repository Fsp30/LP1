package lista_2_heranca.biblioteca;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class RevistaTest {
    @Test
    void deveCalcularDataDevolucaoDaRevistaEm7Dias() {
        Revista revista = new Revista("National Geographic", 2023);
        LocalDate emprestimo = LocalDate.of(2024, 1, 1);
        assertEquals(LocalDate.of(2024, 1, 8), revista.calcularDataDevolucao(emprestimo));
    }

    @Test
    void deveRetornarTituloDaRevista() {
        Revista revista = new Revista("National Geographic", 2023);
        assertEquals("National Geographic", revista.getTitulo());
    }

    @Test
    void deveDevolverRevistaCorretamenteQuandoEmprestimoNaViradaDoMes() {
        Revista revista = new Revista("Veja", 2024);
        LocalDate emprestimo = LocalDate.of(2024, 1, 28);
        assertEquals(LocalDate.of(2024, 2, 4), revista.calcularDataDevolucao(emprestimo));
    }
}