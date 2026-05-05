package exercicioRelampagoSurpresaPi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void deveRetornarNomeEstadoNaturalidade() {
        Estado estado = new Estado("RJ");
        Cidade cidade = new Cidade("Rio de Janeiro",estado);
        Aluno aluno = new Aluno();
        aluno.setNaturalidade(cidade);
        assertEquals("RJ", aluno.getNomeEstadoNaturalidade());
    }

    @Test
    void deveRetornarAlunoSemNaturalidade() {
        try {
            Aluno aluno = new Aluno();
            aluno.getNomeEstadoNaturalidade();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Pessoa sem naturalidade", e.getMessage());
        }
    }

    @Test
    void deveRetornarEstadoDeEstudo(){
        Curso curso = new Curso(new Professor(), new TipoEnsino("fundamental"));
        Escola escola = new Escola("Escola Teste", new Professor());
        curso.setEscola(escola);
        escola.setCidade(new Cidade("Juiz de Fora", new Estado("Minas Gerais")));
        Aluno aluno = new Aluno();
        aluno.setCurso(curso);
        assertEquals("Minas Gerais", aluno.getEstadoDeEstudo());
    }

    @Test
    void deveRetornarAlunoSemCurso(){
        try{
            Aluno aluno = new Aluno();
            aluno.getEstadoDeEstudo();
            fail();
        }catch (NullPointerException e){
            assertEquals("O Aluno não está matriculado em um curso", e.getMessage());
        }
    }

    @Test
    void deveRetornarCoordenadorDeCurso(){
        Aluno aluno = new Aluno();
        Professor coordenador = new Professor();
        Curso curso = new Curso(coordenador, new TipoEnsino("fundamental"));
        aluno.setCurso(curso);
        assertSame(curso.getCoordenador(), aluno.getCoordenadorDeCurso());
    }

    @Test
    void deveRetornarAlunoNaoMatriculadoEmNenhumCurso(){
        try{
            Aluno aluno = new Aluno();
            aluno.validarMatricula();
            fail();
        }catch (NullPointerException e){
            assertEquals("O Aluno não está matriculado em um curso", e.getMessage());
        }
    }
}