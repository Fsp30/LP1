package if_oo_20261_heranca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContaCorrenteTest {

    @Test
    void deveDepositarComTaxa() {
        ContaBancaria cc = new ContaCorrente("1234", "Wendson", 1000.0f, 5.0f, 30.0f);
        assertEquals(1495.0f, cc.depositar(500.0f));
    }

    @Test
    void deveSacarComFundos() {
        ContaBancaria cc = new ContaCorrente("1234", "Wendson", 1000.0f, 5.0f, 30.0f);
        assertEquals(800.0f, cc.sacar(200.0f));
    }

    @Test
    void deveProcessarFechamentoMes() {
        ContaBancaria cc = new ContaCorrente("1234", "Wendson", 1000.0f, 5.0f, 30.0f);
        assertEquals("Fechamento | Conta: 1234 | Titular: Wendson | Saldo Atualizado: R$ 970.0", cc.processarFechamentoMes());
    }

    @Test
    void naoDeveSacarSemFundo() {
        try {
            ContaBancaria cc = new ContaCorrente("1234", "Wendson", 100.0f, 5.0f, 30.0f);
            cc.sacar(500.0f);
            fail("Deveria ter barrado na clausula de guarda");
        } catch (IllegalArgumentException e) {
            assertEquals("Saldo insuficiente para saque", e.getMessage());
        }
    }
}
