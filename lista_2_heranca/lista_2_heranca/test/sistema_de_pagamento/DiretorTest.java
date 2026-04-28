package lista_2_heranca.sistema_de_pagamento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiretorTest {

    @Test
    void deveCalcularPagamentoDoDiretorComLucroPositivo() {
        Diretor d = new Diretor(10000f, 0.05f);
        // salarioBase (1000) + bonus (10000 * 0.05 = 500) = 1500
        assertEquals(1500f, d.calcularPagamento(), 0.01f);
    }

    @Test
    void deveCalcularBonusParticipacaoComLucroPositivo() {
        Diretor d = new Diretor(20000f, 0.10f);
        assertEquals(2000f, d.calcularBonusParticipacao(), 0.01f);
    }

    @Test
    void deveRetornarBonusZeroQuandoLucroForNegativo() {
        Diretor d = new Diretor(-5000f, 0.10f);
        assertEquals(0f, d.calcularBonusParticipacao(), 0.01f);
    }

    @Test
    void deveCalcularPagamentoDoDiretorComLucroNegativo() {
        Diretor d = new Diretor(-5000f, 0.10f);
        // bonus = 0, pagamento = apenas salarioBase
        assertEquals(1000f, d.calcularPagamento(), 0.01f);
    }

    @Test
    void deveLancarExcecaoAoCriarDiretorComPorcentagemNegativa() {
        try {
            new Diretor(10000f, -1f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O percentual de participação não pode ser negativo", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoAoCriarDiretorComPorcentagemAcimaDe100() {
        try {
            new Diretor(10000f, 101f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O percentual de participação não pode ter valor excedente aos lucros da empresa", e.getMessage());
        }
    }

    @Test
    void deveRetornarPorcentagemDeParticipacaoDoDiretor() {
        Diretor d = new Diretor(10000f, 0.05f);
        assertEquals(0.05f, d.getPorcentagemPartipacao(), 0.001f);
    }

    @Test
    void deveRetornarLucrosDaEmpresaDoDiretor() {
        Diretor d = new Diretor(50000f, 0.05f);
        assertEquals(50000f, d.getLucrosEmpresa(), 0.01f);
    }

    @Test
    void deveCalcularPagamentoDoDiretorComLucroZero() {
        Diretor d = new Diretor(0f, 0.10f);
        assertEquals(1000f, d.calcularPagamento(), 0.01f);
    }
}
