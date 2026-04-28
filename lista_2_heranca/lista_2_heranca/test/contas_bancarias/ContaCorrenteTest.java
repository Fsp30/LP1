package lista_2_heranca.contas_bancarias;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaCorrenteTest {

    @Test
    void deveDepositarDinheiroNaContaCorrente() {
        ContaCorrente conta = new ContaCorrente("1234","João", 0);
        conta.depositar(100f);
        assertEquals(99.50, conta.getSaldo());
    }

    @Test
    void deveTentarDepositarAbaixoDaTaxaDeManutencao(){
        try{
            ContaCorrente conta = new ContaCorrente("1234", "João", 0);
            conta.depositar(0.50f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor insuficiente para cobrir a taxa de depósito.", e.getMessage());
        }
    }

    @Test
    void deveTentarSacarValorMaiorAoPresenteNoSaldo(){
        try{
            ContaCorrente conta = new ContaCorrente("1234", "João", 100);
            conta.sacar(1000);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Saldo insuficiente para saque.", e.getMessage());
        }
    }


    @Test
    void deveSacarDinheiroNaContaCorrente() {
        ContaCorrente conta = new ContaCorrente("1234", "João", 100f);
        conta.sacar(100f);
        assertEquals(0, conta.getSaldo());
    }

    @Test
    void deveRetornarValorMensalDeJuros() {
        ContaCorrente conta = new ContaCorrente("1234", "João", 100f);
        assertEquals(-20f, conta.calcularJuros());
    }

    @Test
    void deveCalcularOValorDoSaldoAplicandoOValorDeJuros(){
        ContaCorrente conta = new ContaCorrente("1234", "João", 100f);
        conta.executarAtualizacaoMensal();
        assertEquals(80f, conta.getSaldo());
    }

    @Test
    void deveTentarAplicarOValorDoJurosComValorInferiorATaxaMensalEDeveFalhar(){
        try{
            ContaCorrente conta = new ContaCorrente("1234", "João", 19.99f);
            conta.executarAtualizacaoMensal();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O saldo da conta não pode ser inferior a zero", e.getMessage());
        }
    }


}