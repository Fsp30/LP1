import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {
    
    Funcionario funcionario;

    @BeforeEach
    public void setUp() {
        funcionario = new Funcionario("Wendson", "Desenvolvedor", 3000.0f, "TI");
    }

    @Test
    public void deveMudarDepartamentoCorretamente() {
        funcionario.mudar_departamento("Engenharia de Software");
        assertEquals("Engenharia de Software", funcionario.getDepartamento());
    }

    @Test
    public void deveReceberAumentoCorretamente() {
        funcionario.receber_aumento(10.0f);
        assertEquals(3300.0f, funcionario.getSalario());
    }
}

