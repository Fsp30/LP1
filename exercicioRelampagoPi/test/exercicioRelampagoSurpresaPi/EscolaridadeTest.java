package exercicioRelampagoSurpresaPi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EscolaridadeTest {

    @Test
    void deveRetornarNomeEscolaridade() {
        Escolaridade escolaridade = new Escolaridade("Doutor");
        assertEquals("Doutor", escolaridade.getNome());
    }

    @Test
    void deveTentarColocarNomeEscolaridaVazio() {
        try{
            Escolaridade escolaridae = new Escolaridade(null);
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("O nome da escolaridade não pode estar vazio", e.getMessage());
        }
    }
}