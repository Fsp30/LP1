package exercicioRelampagoSurpresaPi;

public class Aluno extends Pessoa {
    Curso curso;

    public Curso getCurso(){
        return this.curso;
    }

    public void setCurso(Curso curso){
        if(curso == null){
            throw new IllegalArgumentException("Curso não pode estar vazio");
        }
        this.curso = curso;
    }

    public String getEstadoDeEstudo(){
        this.validarMatricula();
        return this.curso.getEstadoDoCurso();
    }

    public Professor getCoordenadorDeCurso(){
        this.validarMatricula();
        return this.curso.getCoordenador();
    }

    public void validarMatricula(){
        if(this.curso == null){
            throw new NullPointerException("O Aluno não está matriculado em um curso");
        }
    }

}
