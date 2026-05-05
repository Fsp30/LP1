package exercicioRelampagoSurpresaPi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    @Test
    void deveRetornarAEscolaridadeDeUmCoordenador() {
        Professor coordenador = new Professor();
        Curso curso = new Curso(coordenador, new TipoEnsino("fundamental"));
        Escolaridade escolaridade = new Escolaridade("Doutor");
        coordenador.setEscolaridade(escolaridade);
        assertEquals("Doutor", curso.getNomeEscolaridadeCoordenador());
    }

    @Test
    void deveRetornarCoordenadorSemEscolaridade() {
        try {
            Professor coordenador = new Professor();
            Curso curso = new Curso(coordenador, new TipoEnsino("fundamental"));
            curso.getNomeEscolaridadeCoordenador();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Pessoa sem escolaridade", e.getMessage());
        }
    }

    @Test
    void deveTentarSetarCoordenadorVazio(){
        try{
            Curso curso = new Curso(null, new TipoEnsino("fundamental"));
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("O Curso precisa de um coordenador", e.getMessage());
        }
    }
}