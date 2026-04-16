package if_oo_20261_heranca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SistemaPagamentoTest {

    @Test
    void deveCalcularPagamentoFuncionarioComum() {
        Funcionario funcionario = new FuncionarioComum(2000.0f);
        assertEquals(2000.0f, funcionario.calcularPagamento());
    }

    @Test
    void deveCalcularPagamentoGerente() {
        Funcionario gerente = new Gerente(4000.0f, 1500.0f);
        assertEquals(5500.0f, gerente.calcularPagamento());
    }

    @Test
    void deveCalcularPagamentoDiretor() {
        Funcionario diretor = new Diretor(8000.0f, 100000.0f, 0.05f);
        assertEquals(13000.0f, diretor.calcularPagamento());
    }
    
    @Test
    void naoDeveAceitarSalarioNegativo() {
        try {
            Funcionario gerente = new Gerente(-1000.0f, 500.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O salario não pode ser negativo", e.getMessage());
        }
    }
    
    @Test
    void naoDeveAceitarParticipacaoMaiorQueCemPorcento() {
        try {
            Funcionario diretor = new Diretor(8000.0f, 100000.0f, 1.5f); 
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O percentual não pode ser maior que 100% (1.0)", e.getMessage());
        }
    }
}
