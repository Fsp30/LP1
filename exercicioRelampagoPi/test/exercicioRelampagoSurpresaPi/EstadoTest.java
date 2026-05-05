package exercicioRelampagoSurpresaPi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstadoTest {

    @Test
    void deveRetornarNomeEstado() {
        Estado estado = new Estado("Minas Gerais");
        assertEquals("Minas Gerais", estado.getNome());
    }

    @Test
    void deveTentarColocarNomeEstadoVazio() {
        try{
            Estado escolaridae = new Estado("");
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("O nome do Estado não pode estar vazio", e.getMessage());
        }
    }
}