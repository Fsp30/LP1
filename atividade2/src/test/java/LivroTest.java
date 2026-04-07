import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LivroTest {

    Livro livro;

    @BeforeEach
    public void setUp() {
        livro = new Livro();
        livro.setTitulo("Arquitetura Limpa");
        livro.setAutor("Uncle Bob");
        livro.setAnoPublicacao(2016);
        livro.setNumeroPaginas(485);
        livro.setGenero("Técnologia");
        livro.setPaginaAtual(1);
    }

    @Test
    public void deveDefinirTituloValido() {
        livro.setTitulo("Clean Code");
        assertEquals("Clean Code", livro.getTitulo());
    }

    @Test
    public void deveTentarDefinirTituloVazio() {
        try {
            livro.setTitulo("   ");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O titulo não pode estar vazio", e.getMessage());
        }
    }

    @Test
    public void deveDefinirAutorValido() {
        livro.setAutor("Aluísio");
        assertEquals("Aluísio", livro.getAutor());
    }

    @Test
    public void deveTentarDefinirAutorVazio() {
        try {
            livro.setAutor("   ");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O nome do autor não pode estar vazio", e.getMessage());
        }
    }

    @Test
    public void deveDefinirAnoPublicacaoValido() {
        livro.setAnoPublicacao(2000);
        assertEquals(2000, livro.getAnoPublicacao());
    }

    @Test
    public void deveTentarDefinirAnoMuitoAntigo() {
        try {
            livro.setAnoPublicacao(-5001);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O ano de publicação não pode ser anterior a 5000 A.C", e.getMessage());
        }
    }

    @Test
    public void deveTentarDefinirAnoFuturo() {
        try {
            livro.setAnoPublicacao(2028);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O ano de publicação do livro não pode ser posterior à de 2027", e.getMessage());
        }
    }


    @Test
    public void deveDefinirNumeroPaginasValido() {
        livro.setNumeroPaginas(300);
        assertEquals(300, livro.getNumeroPaginas());
    }

    @Test
    public void deveTentarDefinirNumeroPaginasZero() {
        try {
            livro.setNumeroPaginas(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O livro deve ter ao menos uma página", e.getMessage());
        }
    }


    @Test
    public void deveDefinirGeneroValido() {
        livro.setGenero("Ficção Científica");
        assertEquals("Ficção Científica", livro.getGenero());
    }

    @Test
    public void deveTentarDefinirGeneroVazio() {
        try {
            livro.setGenero("   ");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O genêro do livro não pode estar vazio", e.getMessage());
        }
    }


    @Test
    public void deveDefinirPaginaAtualValida() {
        livro.setPaginaAtual(100);
        assertEquals(100, livro.getPaginaAtual());
    }

    @Test
    public void deveTentarDefinirPaginaAtualMenorQueUm() {
        try {
            livro.setPaginaAtual(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Não se pode estar numa pagina anterior a pagina 1", e.getMessage());
        }
    }

    @Test
    public void deveTentarDefinirPaginaAtualAlemDoLimite() {
        try {
            livro.setPaginaAtual(486);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Não se pode estar numa pagina posterior ao número de paginas do livro", e.getMessage());
        }
    }


    @Test
    public void deveAbrirLivro() {
        String resultado = livro.abrir();
        assertEquals("O livro foi aberto", resultado);
        assertTrue(livro.getEstado());
    }

    @Test
    public void deveTentarAbrirLivroJaAberto() {
        livro.abrir();
        try {
            livro.abrir();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O estado do livro deve estar difenrente para tal ação (aberto ou fechado)", e.getMessage());
        }
    }

    @Test
    public void deveFecharLivro() {
        livro.abrir();
        String resultado = livro.fechado();
        assertEquals("O livro foi fechado", resultado);
        assertFalse(livro.getEstado());
    }

    @Test
    public void deveTentarFecharLivroJaFechado() {
        try {
            livro.fechado();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O estado do livro deve estar difenrente para tal ação (aberto ou fechado)", e.getMessage());
        }
    }


    @Test
    public void deveMarcaPagina() {
        livro.setPaginaAtual(50);
        livro.marcaPagina();
        assertEquals(50, livro.getPaginaMarcada());
    }


    @Test
    public void deveAvancarPagina() {
        livro.setPaginaAtual(10);
        livro.avancarPagina();
        assertEquals(11, livro.getPaginaAtual());
    }

    @Test
    public void deveTentarAvancarPaginaNoFimDoLivro() {
        livro.setPaginaAtual(485);
        try {
            livro.avancarPagina();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Voce já está no fim do livro", e.getMessage());
        }
    }


    @Test
    public void deveRetrocederPagina() {
        livro.setPaginaAtual(10);
        livro.retrocederPagina();
        assertEquals(9, livro.getPaginaAtual());
    }

    @Test
    public void deveTentarRetrocederPaginaNaPaginaUm() {
        livro.setPaginaAtual(1);
        try {
            livro.retrocederPagina();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O livro já está na pagina 1, não se pode retroceder", e.getMessage());
        }
    }
}