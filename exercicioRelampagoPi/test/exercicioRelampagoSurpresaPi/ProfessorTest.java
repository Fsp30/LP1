package exercicioRelampagoSurpresaPi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    void deveRetornarEscolaridadeProfessor() {
        Escolaridade escolaridade = new Escolaridade("Doutorado");
        Professor professor = new Professor();
        professor.setEscolaridade(escolaridade);
        assertEquals("Doutorado", professor.getNomeEscolaridade());
    }

    @Test
    void deveRetornarProfessorSemEscolaridade() {
        try {
            Professor professor = new Professor();
            professor.getNomeEscolaridade();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Pessoa sem escolaridade", e.getMessage());
        }
    }

    @Test
    void deveRetornarNomeCidadeDeNascimento(){
        Professor professor = new Professor();
        Cidade cidade = new Cidade("Juiz de Fora",new Estado("Minas Gerais"));
        professor.setNaturalidade(cidade);
        assertEquals("Juiz de Fora", professor.getNomeCidadeNaturalidade());
    }

    @Test
    void deveRetornarSemCidadeNaturalidade(){
        try{
            Professor professor = new Professor();
            professor.getNomeCidadeNaturalidade();
            fail();
        }catch (NullPointerException e){
            assertEquals("Pessoa sem naturalidade", e.getMessage());
        }
    }

    @Test
    void deveRetornarOTipoDeEnsinoLecionado(){
        Professor professor = new Professor();
        Curso curso = new Curso(new Professor(), new TipoEnsino("superior"));
        professor.setCurso(curso);
        assertEquals("superior", professor.getNomeTipoEnsinoCurso());
    }

    @Test
    void deveRetonarDiretorDaEscola(){
        Professor diretor = new Professor();
        Escola escola = new Escola("Escola Teste", diretor);
        Professor professor = new Professor();
        professor.setEscola(escola);
        assertSame(escola.getDiretor(), professor.getDiretorEscola());
    }

    @Test
    void deveRetornarProfessorSemEscola(){
        try{
            Professor professor = new Professor();
            professor.getEscola();
            fail();
        }catch (NullPointerException e){
            assertEquals("O Professor não está trabalhando em uma escola", e.getMessage());
        }
    }

    @Test
    void deveRetornarCoordenadorDeCurso(){
        Professor coordenador = new Professor();
        Curso curso = new Curso(coordenador, new TipoEnsino("médio"));
        Professor professor = new Professor();
        professor.setCurso(curso);
        assertSame(curso.getCoordenador(), professor.getCoordenadorDeCurso());
    }

    @Test
    void deveRetornarProfessorSemCurso(){
        try{
            Professor professor = new Professor();
            professor.getCurso();
            fail();
        }catch (NullPointerException e){
            assertEquals("O Professor não está trabalhando em um Curso", e.getMessage());
        }
    }
}