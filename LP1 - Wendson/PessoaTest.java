import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {
    
    Pessoa pessoa;

    @BeforeEach
    public void setUp() {
        pessoa = new Pessoa("Wendson", 20, 170.0f, 70.0f);
    }

    @Test
    public void deveCrescerSeTiverMenosDe21Anos() {
        pessoa.setIdade(20);
        pessoa.crescer(5.0f);
        assertEquals(175.0f, pessoa.getAltura());
    }

    @Test
    public void naoDeveCrescerSeTiver21AnosOuMais() {
        try {
            pessoa.setIdade(21);
            pessoa.crescer(5.0f);
            fail("Deveria ter lancado excecao por causa da idade");
        } catch (IllegalStateException e) {
            assertEquals("A pessoa não pode crescer com 21 anos ou mais", e.getMessage());
        }
    }

    @Test
    public void naoDevePerderMaisPesoDoQueTem() {
        try {
            pessoa.perder_peso(80.0f); 
            fail("Deveria ter lancado excecao por peso negativo");
        } catch (IllegalArgumentException e) {
            assertEquals("A pessoa não pode ficar com peso igual ou menor que zero", e.getMessage());
        }
    }
}

