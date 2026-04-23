package if_oo_20261_heranca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FuncionarioComumTest {

    @Test
    void deveCalcularPagamento() {
        Funcionario funcionario = new FuncionarioComum(2000.0f);
        assertEquals(2000.0f, funcionario.calcularPagamento());
    }

    @Test
    void deveGerarHolerite() {
        Funcionario funcionario = new FuncionarioComum(2000.0f);
        assertEquals("Holerite processado. Valor a receber: R$ 2000.0", funcionario.gerarHolerite());
    }

    @Test
    void naoDeveAceitarSalarioInvalido() {
        try {
            Funcionario funcionario = new FuncionarioComum(0.0f);
            fail("Deveria ter barrado na clausula de guarda");
        } catch (IllegalArgumentException e) {
            assertEquals("O salario deve ser maior que zero", e.getMessage());
        }
    }
}
