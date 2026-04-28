package lista_2_heranca.contas_bancarias;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaPoupancaTest {

    @Test
    void deveDepositarNaContaPoupanca() {
        ContaPoupanca conta = new ContaPoupanca("1234", "João", 0);
        conta.depositar(100f);
        assertEquals(100f, conta.getSaldo());
    }

    @Test
    void deveTentarDepositarUmValorNegativoNaConta(){
        try{
            ContaPoupanca conta = new ContaPoupanca("1234", "João", 0);
            conta.depositar(-1f);
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("É necessário depositar um valor superior a zero", e.getMessage());
        }
    }

    @Test
    void deveTentarDepositarZeroNaConta(){
        try{
            ContaPoupanca conta = new ContaPoupanca("1234", "João", 0);
            conta.depositar(0);
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("É necessário depositar um valor superior a zero", e.getMessage());
        }
    }

    @Test
    void deveSacarValorDaPoupanca() {
        ContaPoupanca conta = new ContaPoupanca("1234", "João", 20f);
        conta.sacar(20f);
        assertEquals(0, conta.getSaldo());
    }

    @Test
    void deveTentarSacarValorMaiorAoPresenteNoSaldo(){
        try{
            ContaPoupanca conta = new ContaPoupanca("1234", "João", 100);
            conta.sacar(1000);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Saldo insuficiente na poupança.", e.getMessage());
        }
    }

    @Test
    void deveCalcularJuros() {
        ContaPoupanca conta = new ContaPoupanca("1234", "João", 1000);
        assertEquals(5f, conta.calcularJuros());
    }

    @Test
    void deveAtualizarValorDaPoupancaComJuros(){
        ContaPoupanca conta = new ContaPoupanca("1234", "João", 1000);
        conta.calcularJuros();
        conta.executarAtualizacaoMensal();
        assertEquals(1005.00f, conta.getSaldo());
    }
}