package exercicioRelampagoSurpresaPi;

public class Professor extends Pessoa {
    Curso curso;
    Escola escola;

    public Curso getCurso() {
        this.validarVinculoComCurso();
        return this.curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getNomeTipoEnsinoCurso(){
        this.validarVinculoComCurso();
        return this.curso.getNomeTipoDeEnsino();
    }

    public Escola getEscola() {
        this.validarVinculoComEscola();
        return this.escola;
    }

    public void setEscola(Escola escola) {
        if(escola == null){
            throw new IllegalArgumentException("O objeto não corresponde ao formato de Escola");
        }
        this.escola = escola;
    }

    public Professor getDiretorEscola(){
        this.validarVinculoComEscola();
        return this.escola.getDiretor();
    }

    public Professor getCoordenadorDeCurso(){
        this.validarVinculoComCurso();
        return this.curso.getCoordenador();
    }

    public void validarVinculoComEscola(){
        if(this.escola == null){
            throw new NullPointerException("O Professor não está trabalhando em uma escola");
        }
    }

    public void validarVinculoComCurso(){
        if(this.curso == null){
            throw new NullPointerException("O Professor não está trabalhando em um Curso");
        }
    }

}
