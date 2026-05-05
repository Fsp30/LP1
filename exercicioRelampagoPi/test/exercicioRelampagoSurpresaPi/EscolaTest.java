package exercicioRelampagoSurpresaPi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EscolaTest {

    @Test
    void deveRetornarEscolaridadeDoDiretor(){
        Escolaridade escolaridade = new Escolaridade("Mestre");
        Professor diretor = new Professor();
        diretor.setEscolaridade(escolaridade);
        Escola escola = new Escola("Professora Eunice Alves Vieira",diretor);
        assertEquals("Mestre", escola.getNomeEscolaridadeDiretor());
    }

    @Test
    void deveRetornarDiretorSemEscolaridade(){
        try{
            Professor diretor = new Professor();
            Escola escola =  new Escola("Professora Eunice Alves Vieira",diretor);
            escola.getNomeEscolaridadeDiretor();
            fail();
        }catch (NullPointerException e){
            assertEquals("Pessoa sem escolaridade", e.getMessage());
        }
    }

    @Test
    void deveTentarCriarEscolaSemDiretor(){
        try {
            Escola escola = new Escola("Professora Eunice Alves Vieira",null);
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("A Escola precisa de um diretor", e.getMessage());
        }
    }

    @Test
    void deveRetornarNome(){
        Escola escola = new Escola("Professora Eunice Alves Vieira", new Professor());
        assertEquals("Professora Eunice Alves Vieira", escola.getNome());
    }

    @Test
    void deveTentarEscolaComNomeVazio(){
        try{
            Escola escola = new Escola("", new Professor());
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("O nome da escola não pode ser vazio", e.getMessage());
        }
    }


}