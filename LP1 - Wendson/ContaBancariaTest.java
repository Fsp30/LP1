import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContaBancariaTest {
    
    ContaBancaria conta;

    @BeforeEach
    public void setUp() {
        conta = new ContaBancaria("Wendson", "123-X");
        conta.setSaldo(100.0f);
    }

    @Test
    public void deveDepositarValorCorretamente() {
        conta.depositar(50.0f);
        assertEquals(150.0f, conta.getSaldo());
    }

    @Test
    public void deveSacarValorComSaldoSuficiente() {
        conta.sacar(40.0f);
        assertEquals(60.0f, conta.getSaldo());
    }

    @Test
    public void deveValidarSaqueComSaldoInsuficiente() {
        try {
            conta.sacar(150.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Saldo insuficiente para realizar o saque", e.getMessage());
        }
    }
}

