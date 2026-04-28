package lista_2_heranca.sistema_de_pagamento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GerenteTest {
    @Test
    void deveCalcularPagamentoDoGerenteComBonus() {
        Gerente g = new Gerente(500f);
        // salarioBase (1000) + bonus (500) = 1500
        assertEquals(1500f, g.calcularPagamento(), 0.01f);
    }

    @Test
    void deveCalcularPagamentoDoGerenteComBonusZero() {
        Gerente g = new Gerente(0f);
        assertEquals(1000f, g.calcularPagamento(), 0.01f);
    }

    @Test
    void deveRetornarBonusDoGerente() {
        Gerente g = new Gerente(300f);
        assertEquals(300f, g.getBonus(), 0.01f);
    }

    @Test
    void deveLancarExcecaoAoCriarGerenteComBonusNegativo() {
        try {
            new Gerente(-1f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O valor do bonus não pode ser negativo", e.getMessage());
        }
    }

    @Test
    void deveAtualizarBonusDoGerente() {
        Gerente g = new Gerente(200f);
        g.setBonus(800f);
        assertEquals(1800f, g.calcularPagamento(), 0.01f);
    }

    @Test
    void deveLancarExcecaoAoAtualizarBonusDoGerenteParaNegativo() {
        try {
            Gerente g = new Gerente(200f);
            g.setBonus(-100f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O valor do bonus não pode ser negativo", e.getMessage());
        }
    }
}