package lista_2_heranca.contas_bancarias;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaBancariaTest {

    @Test
    void deveTentarInclurTitularVazio() {
        try{
            ContaPoupanca conta = new ContaPoupanca("     ", "1234", 1000);
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("O titular deve ter um nome", e.getMessage());
        }
    }

    @Test
    void deveTentarIncluirNumeroDeContaVazio() {
        try{
            ContaPoupanca conta = new ContaPoupanca("João", "   ", 1000);
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("O numero da conta não pode ser vazio", e.getMessage());
        }
    }

    @Test
    void deveTentarIncluirSaldoNegativo() {
        try{
            ContaPoupanca conta = new ContaPoupanca("João", "1234", -1.0f);
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("O saldo da conta não pode ser inferior a zero", e.getMessage());
        }
    }

    @Test
    void deveRetornarTitular() {
        ContaPoupanca conta = new ContaPoupanca("João", "1234", 0);
        assertEquals("João", conta.getTitular());
    }

    @Test
    void deveRetornarNumeroDaConta() {
        ContaPoupanca conta = new ContaPoupanca("João", "1234", 0);
        assertEquals("1234", conta.getNumeroConta());
    }

    @Test
    void deveRetornarSaldo() {
        ContaPoupanca conta = new ContaPoupanca("João", "1234", 100);
        assertEquals(100f, conta.getSaldo());
    }
}