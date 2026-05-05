package exercicioRelampagoSurpresaPi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TipoEnsinoTest {

    @Test
    void deveRetornarTipoEnsino() {
        TipoEnsino tipo = new TipoEnsino("médio");
        assertEquals("médio", tipo.getNome());
    }

    @Test
    void deveTenarIncluirTipoEnsinoVazio() {
        try{
            new TipoEnsino("");
            fail();
        }catch(IllegalArgumentException e){
            assertEquals("O tipo de Ensino não pode estar vazio", e.getMessage());
        }
    }
}