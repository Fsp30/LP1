import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    Funcionario funcionario;

    @BeforeEach
    public void setUp() {
        funcionario = new Funcionario();
        funcionario.setNome("Ana");
        funcionario.setCargo("Desenvolvedora");
        funcionario.setSalario(3000f);
        funcionario.setDepartamento("TI");
    }

    // ---------- setNome ----------

    @Test
    public void deveDefinirNomeValido() {
        funcionario.setNome("Pedro");
        assertEquals("Pedro", funcionario.getNome());
    }

    @Test
    public void deveTentarDefinirNomeVazio() {
        try {
            funcionario.setNome("   ");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O funcionário deve ter um nome", e.getMessage());
        }
    }

    // ---------- setCargo ----------

    @Test
    public void deveDefinirCargoValido() {
        funcionario.setCargo("Gerente");
        assertEquals("Gerente", funcionario.getCargo());
    }

    @Test
    public void deveTentarDefinirCargoVazio() {
        try {
            funcionario.setCargo("   ");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O nome do cargo não pode estar vazio", e.getMessage());
        }
    }

    // ---------- setSalario ----------

    @Test
    public void deveDefinirSalarioValido() {
        funcionario.setSalario(5000f);
        assertEquals(5000f, funcionario.getSalario());
    }

    @Test
    public void deveDefinirSalarioMinimo() {
        funcionario.setSalario(1500f);
        assertEquals(1500f, funcionario.getSalario());
    }

    @Test
    public void deveTentarDefinirSalarioAbaixoDoMinimo() {
        try {
            funcionario.setSalario(1499f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O valor do salário não pode ser inferior ao salário minímo", e.getMessage());
        }
    }

    // ---------- setDepartamento ----------

    @Test
    public void deveDefinirDepartamentoValido() {
        funcionario.setDepartamento("RH");
        assertEquals("RH", funcionario.getDepartamento());
    }

    @Test
    public void deveTentarDefinirDepartamentoVazio() {
        try {
            funcionario.setDepartamento("   ");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O nome do departamento não pode estar vazio", e.getMessage());
        }
    }

    // ---------- receberAumento ----------

    @Test
    public void deveReceberAumento() {
        funcionario.receberAumento(10);
        assertEquals(3300f, funcionario.getSalario(), 0.01f);
    }

    @Test
    public void deveTentarReceberAumentoZero() {
        try {
            funcionario.receberAumento(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O percentual de aumento de salário deve ser ao minimo 1%", e.getMessage());
        }
    }

    @Test
    public void deveTentarReceberAumentoNegativo() {
        try {
            funcionario.receberAumento(-5);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O percentual de aumento de salário deve ser ao minimo 1%", e.getMessage());
        }
    }

    // ---------- calcularAumento ----------

    @Test
    public void deveCalcularAumento() {
        float aumento = funcionario.calcularAumento(10);
        assertEquals(300f, aumento, 0.01f);
    }


/*
    @Test
    public void deveMudarDepartamento() {
        funcionario.mudarDepartamento("Financeiro");
        assertEquals("Financeiro", funcionario.getDepartamento());
    }

    @Test
    public void deveTentarMudarParaOMesmoDepartamento() {
        try {
            funcionario.mudarDepartamento("TI");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O departamento deve ser alterado", e.getMessage());
        }
    }

 */
}