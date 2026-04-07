import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    Pessoa pessoa;

    @BeforeEach
    public void setUp() {
        pessoa = new Pessoa();
        pessoa.setNome("Maria");
        pessoa.setIdade(20);
        pessoa.setAltura(160);
        pessoa.setPeso(60f);
    }


    @Test
    public void deveDefinirNomeValido() {
        pessoa.setNome("Carlos");
        assertEquals("Carlos", pessoa.getNome());
    }

    @Test
    public void deveTentarDefinirNomeVazio() {
        try {
            pessoa.setNome("   ");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("A pessoa deve ter um nome", e.getMessage());
        }
    }

    @Test
    public void deveDefinirIdadeValida() {
        pessoa.setIdade(30);
        assertEquals(30, pessoa.getIdade());
    }

    @Test
    public void deveTentarDefinirIdadeNegativa() {
        try {
            pessoa.setIdade(-1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O valor da idade não pode ser negativo", e.getMessage());
        }
    }

    @Test
    public void deveDefinirAlturaValida() {
        pessoa.setAltura(170);
        assertEquals(170, pessoa.getAltura());
    }

    @Test
    public void deveTentarDefinirAlturaNegativa() {
        try {
            pessoa.setAltura(-1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O valor da altura não pode ser negativo", e.getMessage());
        }
    }

    @Test
    public void deveDefinirPesoValido() {
        pessoa.setPeso(70f);
        assertEquals(70f, pessoa.getPeso());
    }

    @Test
    public void deveTentarDefinirPesoNegativo() {
        try {
            pessoa.setPeso(-1f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O valor do peso não pode ser negativo", e.getMessage());
        }
    }


    @Test
    public void deveEnvelhecer() {
        pessoa.envelhecer();
        assertEquals(21, pessoa.getIdade());
    }

    @Test
    public void deveCrescer() {
        pessoa.crescer(5);
        assertEquals(165, pessoa.getAltura());
    }

    @Test
    public void deveTentarCrescerValorMenorQueUm() {
        try {
            pessoa.crescer(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Não se pode crescer um valor abaixo de 1 centímetro", e.getMessage());
        }
    }

    @Test
    public void deveTentarCrescerAposVinteEUmAnos() {
        pessoa.setIdade(22);
        try {
            pessoa.crescer(5);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Não se pode crescer após os 21 anos", e.getMessage());
        }
    }

    @Test
    public void deveGanharPeso() {
        pessoa.ganharPeso(5f);
        assertEquals(65f, pessoa.getPeso());
    }

    @Test
    public void deveTentarGanharPesoNegativo() {
        try {
            pessoa.ganharPeso(-1f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Não se pode ganahr pesos de valor negativo", e.getMessage());
        }
    }

    @Test
    public void devePerderPeso() {
        pessoa.perderPeso(5f);
        assertEquals(55f, pessoa.getPeso());
    }

    @Test
    public void deveTentarPerderPesoNegativo() {
        try {
            pessoa.perderPeso(-1f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Não se pode perder pesos de valor negativo", e.getMessage());
        }
    }

    @Test
    public void deveTentarPerderPesoMaiorQueOPesoAtual() {
        try {
            pessoa.perderPeso(61f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O peso da pessoa não pode ser negativo", e.getMessage());
        }
    }
}