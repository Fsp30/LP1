package if_oo_20261_heranca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContaPoupancaTest {

    @Test
    void deveDepositarESacarSemTaxa() {
        ContaBancaria cp = new ContaPoupanca("9876", "Maria", 1000.0f, 0.01f);
        cp.depositar(500.0f); 
        assertEquals(1300.0f, cp.sacar(200.0f)); 
    }

    @Test
    void deveProcessarFechamentoMesComRendimento() {
        ContaBancaria cp = new ContaPoupanca("9876", "Maria", 1000.0f, 0.01f);
        assertEquals("Fechamento | Conta: 9876 | Titular: Maria | Saldo Atualizado: R$ 1010.0", cp.processarFechamentoMes());
    }

    @Test
    void naoDeveAceitarDepositoNegativo() {
        try {
            ContaBancaria cp = new ContaPoupanca("9876", "Maria", 1000.0f, 0.01f);
            cp.depositar(-50.0f);
            fail("Deveria ter barrado na clausula de guarda");
        } catch (IllegalArgumentException e) {
            assertEquals("O valor de deposito deve ser maior que zero", e.getMessage());
        }
    }
}
