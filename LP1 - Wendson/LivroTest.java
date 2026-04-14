import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LivroTest {
    
    Livro livro;

    @BeforeEach
    public void setUp() {
        livro = new Livro("Aprenda Java", "Professor", 2023, 100, "Educacional");
    }

    @Test
    public void deveAvancarPaginaCorretamente() {
        livro.abrir();
        livro.avancar_pagina();
        assertEquals(2, livro.getPaginaAtual());
    }

    @Test
    public void naoDeveAvancarAlemDaUltimaPagina() {
        try {
            livro.abrir();
            livro.marcar_pagina(100);
            livro.avancar_pagina();
            fail("Deveria ter lancado excecao por passar da ultima pagina");
        } catch (IllegalArgumentException e) {
            assertEquals("O livro ja esta na ultima pagina", e.getMessage());
        }
    }
    
    @Test
    public void deveFecharOLivro() {
        livro.abrir();
        livro.fechar();
        assertFalse(livro.isAberto());
    }
}

