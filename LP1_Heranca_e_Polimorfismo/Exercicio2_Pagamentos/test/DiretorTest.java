package if_oo_20261_heranca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DiretorTest {

    @Test
    void deveCalcularPagamento() {
        Funcionario diretor = new Diretor(8000.0f, 100000.0f, 0.05f);
        assertEquals(13000.0f, diretor.calcularPagamento());
    }

    @Test
    void deveGerarHolerite() {
        Funcionario diretor = new Diretor(8000.0f, 100000.0f, 0.05f);
        assertEquals("Holerite processado. Valor a receber: R$ 13000.0", diretor.gerarHolerite());
    }

    @Test
    void naoDeveAceitarParticipacaoMaiorQueCemPorcento() {
        try {
            Funcionario diretor = new Diretor(8000.0f, 100000.0f, 1.5f); 
            fail("Deveria ter barrado na clausula de guarda");
        } catch (IllegalArgumentException e) {
            assertEquals("O percentual nao pode ser maior que 100% (1.0)", e.getMessage());
        }
    }
}
