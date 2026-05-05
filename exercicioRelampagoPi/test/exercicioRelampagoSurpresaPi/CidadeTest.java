package exercicioRelampagoSurpresaPi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CidadeTest {

    @Test
    void deveRetornarNomeDaCidade(){
        Cidade cidade = new Cidade("Juiz de Fora", new Estado("Minas Gerais"));
        assertEquals("Juiz de Fora", cidade.getNome());
    }

    @Test
    void deveTentarSetarCidadeVazia(){
        try{
            Cidade cidade = new Cidade("", new Estado("Minas Gerais"));
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("O nome da cidade não pode ser vazio", e.getMessage());
        }
    }

    @Test
    void deveRetornarNomeEstado() {
        Estado estado = new Estado("RJ");
        Cidade cidade = new Cidade("Rio de Janeiro",estado);
        assertEquals("RJ", cidade.getNomeEstado());
    }

    @Test
    void deveRetornarEstadoObrigatorio() {
        try {
            Cidade cidade = new Cidade("Rio de Janeiro",null);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Estado obrigatorio", e.getMessage());
        }
    }
}